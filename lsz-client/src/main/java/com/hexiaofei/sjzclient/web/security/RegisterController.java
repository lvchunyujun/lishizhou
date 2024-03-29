package com.hexiaofei.sjzclient.web.security;

import com.hexiaofei.sjzclient.common.EmailSendType;
import com.hexiaofei.sjzclient.common.EmailTemplate;
import com.hexiaofei.sjzclient.domain.UserInfo;
import com.hexiaofei.sjzclient.exception.PlatformException;
import com.hexiaofei.sjzclient.service.IUserInfoService;
import com.hexiaofei.sjzclient.service.sms.SmsEmailService;
import com.hexiaofei.sjzclient.service.sms.SmsUserinfoService;
import com.lcyj.common.bo.sms.SmsEmail;
import com.lcyj.common.bo.sms.SmsUserinfo;
import com.lcyj.common.utils.NumberUtils;
import com.lcyj.common.utils.RegExpValidator;
import com.lcyj.common.vo.ResultVo;
import com.lcyj.common.web.WebCommonConstant;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterController {

    private static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private SmsUserinfoService smsUserinfoService;

    @Autowired
    private SmsEmailService smsEmailService;

    @Autowired
    private IUserInfoService userInfoService;

    @Value("${platform.id}")
    private String platformId;

    @Value("${platform.name}")
    private String platformName;

    @Value("${platform.serverId}")
    private String serverId;

    @Value("${platform.serverName}")
    private String serverName;

    @Value("${platform.serverUrl}")
    private String serverUrl;

    /**
     * step1： 跳转注册页面
     * @return
     */
    @RequestMapping(value = "toRegistor")
    public String toRegistor(){

        return "common/register";
    }

    /**
     * step2: 发送注册码
     * @param request
     * @param email
     * @return
     */
    @RequestMapping(value = "sendCheckCode")
    @ResponseBody
    public ResultVo sendCheckCode(HttpServletRequest request, String email){
        LOGGER.info("【发送注册码邮件】--> email={},platformId={},serverName={},serverUrl={}",email,platformId,serverName,serverUrl);
        ResultVo resultVo = new ResultVo();

        SmsUserinfo smsUserinfo = new SmsUserinfo();

        try{
            // step1:  邮箱正确性校验

            // step2:  邮箱是否已经注册

            if(checkEmail(email,resultVo)){

                HttpSession session = request.getSession();
                String checkCode = generateCheckCode(session);

                smsUserinfo.setEmail(email);
                smsUserinfo.setPlatformId(platformId);

                SmsEmail smsEmail = new SmsEmail();
                smsEmail.setPlatformId(platformId);
                smsEmail.setServerId(serverId);
                smsEmail.setToEmail(email);
                smsEmail.setSubject(EmailSendType.REG_CODE.getDescri());
                smsEmail.setLastUpdateTime(new Date());
                smsEmail.setEmailType(EmailSendType.REG_CODE.getType());
                smsEmail.setCreateTime(new Date());

                Map<String,String> map = new HashMap<>();
                map.put("PLATFORM_NAME",platformId);
                map.put("SERVER_NAME",serverName);
                map.put("SERVER_URL",serverUrl);
                map.put("CHECK_CODE",checkCode);
                smsEmail.setContent(paraseParameterMap(EmailTemplate.REG_CHECK_CODE,map));

                LOGGER.info("【发送注册码邮件】开始发送邮件 email={},platformId={},serverName={},serverUrl={}",email,platformId,serverName,serverUrl);
                String result = smsEmailService.send(smsEmail);
                LOGGER.info("【发送注册码邮件】返回发送结果={} email={},platformId={},serverName={},serverUrl={}",result,email,platformId,serverName,serverUrl);

                if(WebCommonConstant.OK.equals(result)){
                    session.setAttribute(WebCommonConstant.REGISTER_CHECK_EMAIL,email);
                }

                resultVo.setResultCode("0000");
                resultVo.setResultMsg("验证码已经发送，请查收邮件！");
            }
            LOGGER.info("【发送注册码邮件】<-- email={},platformId={},serverName={},serverUrl={}",email,platformId,serverName,serverUrl);
        }catch (Exception e){
            LOGGER.error("验证码发送失败！",e);
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("验证码发送失败，请重新尝试！");
        }


        return resultVo;
    }

    private static String paraseParameterMap(String template,Map<String,String> parasMap){

        template = template.replaceAll("#PLATFORM_NAME#", parasMap.get("PLATFORM_NAME"));
        template = template.replaceAll("#SERVER_NAME#",  parasMap.get("SERVER_NAME"));
        template = template.replaceAll("#SERVER_URL#",  parasMap.get("SERVER_URL"));
        template = template.replaceAll("#CHECK_CODE#", parasMap.get("CHECK_CODE"));

        return template;
    }

    /**
     * step3: 注册
     * @param request
     * @param email
     * @param password
     * @param verifyCode
     * @return
     */
    @RequestMapping(value = "registor")
    @ResponseBody
    public ResultVo registor(HttpServletRequest request,String email,String password,String verifyCode){
        LOGGER.info("【用户注册】-->   [email="+email+"]");
        ResultVo resultVo = new ResultVo();
        String result = "fail";
        HttpSession session = request.getSession();
        String sessionVerifyCode = (String)session.getAttribute(WebCommonConstant.REGISTER_CHECK_CODE);
        String session_email = (String)session.getAttribute(WebCommonConstant.REGISTER_CHECK_EMAIL);

        if(!checkEmail(email,resultVo)){
            LOGGER.info("【用户注册】<--  注册失败!   [email="+email+"]");
            return resultVo;
        }

        if(session_email == null || sessionVerifyCode == null){
            LOGGER.info("【用户注册】<--  session中email["+email+"]为空！   <-- [email="+email+"]");
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("请先获取验证码！");
            return resultVo;
        }
        if(!email.equals(session_email)){
            LOGGER.info("【用户注册】<--  session中email["+email+"]不匹配！   <-- [email="+email+"]");
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("验证码无效，请获取验证码！");
            return resultVo;
        }

        if(verifyCode.equals(sessionVerifyCode)) {
            // 1. 注册用户
            try {
                int resultId = userInfoService.register(email,password);
                if(resultId > 0){
                    resultVo.setResultCode("0000");
                    resultVo.setResultMsg("registor_ok");
                    LOGGER.info("【用户注册】<--   注册成功!    [email="+email+"]");
                }else{
                    LOGGER.info("【用户注册】<-- 注 email["+email+"]保存信息失败！");
                    resultVo.setResultCode("9999");
                    resultVo.setResultMsg("系统出错，请重试！");
                }
            } catch (PlatformException e) {
                LOGGER.error("【用户注册】<--  email["+email+"]失败发证异常！",e);
                resultVo.setResultCode("9999");
                resultVo.setResultMsg("系统出错，请重试！");
            }
            // 2. 保存客户端类型
        }else{
            LOGGER.info("【用户注册】<--  session中email["+email+"]验证码错误！  ");
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("验证码错误！");
        }

        return resultVo;
    }

    @RequestMapping(value = "registor_ok")
    public String registorOk(){


        return "common/register_ok";
    }
    /**
     * HttpSession缓存一个注册校验码
     * @param session
     * @return
     */
    private String generateCheckCode(HttpSession session){
        String checkCode = NumberUtils.genRandomNumberStr(4);
        session.setAttribute(WebCommonConstant.REGISTER_CHECK_CODE,checkCode);
//        session.setMaxInactiveInterval(WebCommonConstant.COOKIE_CHECK_CODE_OUTTIME);
        return checkCode;
    }

    private boolean checkEmail(String email,ResultVo resultVo){
        if(StringUtils.isBlank(email)){
            LOGGER.info("【用户注册】  邮箱不能为空！  [email="+email+"]");
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("邮箱不能为空！");
            return false;
        }
        if(!RegExpValidator.isEmail(email)){
            LOGGER.info("【用户注册】  邮箱格式错误！  [email="+email+"]");
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("邮箱格式错误！");
            return false;
        }
        UserInfo userInfo = userInfoService.getUserInfoByEmail(email);
        if(userInfo != null){
            LOGGER.info("【用户注册】  邮箱已经注册！  [email="+email+"]");
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("邮箱已经注册！");
            return false;
        }
        return true;
    }

    private boolean checkCheckCode(HttpSession session,String email,ResultVo resultVo){

        String sessionVerifyCode = (String)session.getAttribute(WebCommonConstant.REGISTER_CHECK_CODE);
        String session_email = (String)session.getAttribute(WebCommonConstant.REGISTER_CHECK_EMAIL);

        if(email.equals(session_email)&&StringUtils.isNotBlank(sessionVerifyCode)){
            resultVo.setResultCode("9999");
            resultVo.setResultMsg("验证码还在有效，稍后再试！");
            return false;
        }
        return true;
    }


}
