package com.lcyj.sms.web;

import com.lcyj.common.vo.PageVo;
import com.lcyj.common.vo.ResultVo;
import com.lcyj.common.vo.sms.SmsEmailVo;
import com.lcyj.common.web.WebCommonConstant;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsEmail;
import com.lcyj.sms.service.SmsEmailService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(description = "SmsEmail 接口")
@Controller

public class SmsEmailController extends AbstractController implements BaseController<SmsEmail>{

    public static Logger LOGGER = LoggerFactory.getLogger(SmsEmailController.class);

    private final static String BASE_MAPPING_URL = "/sms/email";

    @Autowired
    private SmsEmailService smsEmailService;


    @RequestMapping(value = BASE_MAPPING_URL+"/"+WebCommonConstant.URL_ADD)
    @ResponseBody
    @Override
    public ResultVo add(SmsEmail smsEmail) {
        return null;
    }


    @RequestMapping(value = BASE_MAPPING_URL+"/"+WebCommonConstant.URL_UPDATE)
    @ResponseBody
    @Override
    public ResultVo update(SmsEmail smsEmail) {
        return null;
    }

    @RequestMapping(value = BASE_MAPPING_URL+"/"+WebCommonConstant.URL_GET)
    @Override
    public ResultVo getObject(Integer id) {
        return null;
    }

    @RequestMapping(value = BASE_MAPPING_URL+"/"+WebCommonConstant.URL_DELETE)
    @ResponseBody
    @Override
    public ResultVo delete(Integer id) {
        return null;
    }

    @RequestMapping(value = BASE_MAPPING_URL+"/list")
    @ResponseBody
    public ResultVo listByPaging(@RequestBody SmsEmailVo smsEmailVo) {
        ResultVo rv = new ResultVo();
        PageVo<SmsEmail> pageVo = smsEmailVo.getPageVo();
        SmsEmail smsEmail = new SmsEmail();

        if(pageVo.getCurrentPage()>0){
            pageVo.setCurrentPage(pageVo.getCurrentPage());
        }else{
            pageVo.setCurrentPage(1);
        }
        if(pageVo.getPageSize()>0){
            pageVo.setPageSize(pageVo.getPageSize());
        }
        try {
            // smsEmailVo查询条件转换 smsEmail实体

            pageVo = smsEmailService.getPageVoByObject(pageVo,smsEmail);
            rv.setData(pageVo);
            rv.setResultCode("0000");
            rv.setResultMsg("success");
        } catch (Exception e) {
            rv.setResultCode("9999");
            rv.setResultMsg("网络异常，稍后重试！");
            LOGGER.error("查询异常！",e);
        }

        return rv;
    }

    @RequestMapping(BASE_MAPPING_URL+"/send")
    @ResponseBody
    public String sendEmail(@RequestBody SmsEmail smsEmail){

        try {
            smsEmailService.sendMail(smsEmail);
        } catch (PlatformException e) {
            LOGGER.error("邮件发送异常！",e);
            return FAIL;
        }

        return OK;
    }
}
