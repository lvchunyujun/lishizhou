package com.lcyj.sms.web;

import com.lcyj.common.vo.ResultVo;
import com.lcyj.sms.common.EmailTypeEnum;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsUserinfo;
import com.lcyj.sms.service.SmsUserinfoService;
import com.lcyj.sms.service.message.IEmailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(description = "SmsUserinfo 接口")
@Controller
public class SmsUserinfoController extends AbstractController implements BaseController<SmsUserinfo> {

    public static Logger LOGGER = LoggerFactory.getLogger(SmsUserinfoController.class);

    private final static String BASE_MAPPING_URL = "/userinfo";

    @Autowired
    private SmsUserinfoService smsUserinfoService;

    @Autowired
    private IEmailService emailService;

    /**
     * 添加SMS用户基本信息：
     * @param smsUserinfo
     * @return
     */
    @ApiOperation(httpMethod = "POST",value = "添加SMS用户信息" ,produces = MediaType.TEXT_HTML_VALUE,tags = "add",notes = "参数")
    @RequestMapping(value = BASE_MAPPING_URL+"/"+URL_ADD,method = RequestMethod.POST)
    @ResponseBody
    @Override
    public ResultVo<SmsUserinfo> add(@RequestBody SmsUserinfo smsUserinfo) {
        int resultId = -1;
        try {
            // step1: 创建用户
            resultId = smsUserinfoService.addObject(smsUserinfo);

            // step2: 发送短信服务
            emailService.sendMail(EmailTypeEnum.OTHER,smsUserinfo.getEmail(),"历史轴网站注册","注册激活码！");
        } catch (PlatformException e) {
            LOGGER.error("增加SMS用户信息失败！",e);
        }
        return null;
    }

    @Override
    public ResultVo update(SmsUserinfo smsUserinfo) {
        return null;
    }

    @ApiOperation(value="查询SMS用户信息", notes="查询用户", produces="application/json")
    @ApiImplicitParam(name = "id", value = "SMS用户信息ID", paramType = "path",defaultValue = "1",dataType = "Integer")
    @RequestMapping(value = BASE_MAPPING_URL+"/"+URL_GET+"/{id}",method = RequestMethod.GET)
    @ResponseBody
    @Override
    public ResultVo getObject(@PathVariable("id") Integer id) {
        return null;
    }

    @RequestMapping(value = BASE_MAPPING_URL+"/"+URL_LIST,method = RequestMethod.GET)
    public ResultVo listEventIndex(SmsUserinfo smsUserinfo, int currentPage, int pageSize) {


        return null;
    }

    @RequestMapping(value = BASE_MAPPING_URL+"/"+URL_DELETE,method = RequestMethod.DELETE)
    @Override
    public ResultVo delete(Integer id) {
        return null;
    }

    public ResultVo listByPaging(SmsUserinfo smsUserinfo, int currentPage, int pageSize) {
        return null;
    }

}
