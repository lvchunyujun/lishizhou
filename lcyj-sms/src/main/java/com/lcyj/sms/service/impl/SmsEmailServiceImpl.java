package com.lcyj.sms.service.impl;

import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.common.EmailTypeEnum;
import com.lcyj.sms.dao.mapper.SmsEmailMapper;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsEmail;
import com.lcyj.sms.model.mail.Mail;
import com.lcyj.sms.service.SmsEmailService;
import com.lcyj.sms.service.message.IEmailService;
import com.lcyj.sms.service.message.impl.producer.TaskProducer;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SmsEmailServiceImpl implements SmsEmailService {

    @Autowired
    private SmsEmailMapper smsEmailMapper;

    @Autowired
    private IEmailService emailService;

    @Override
    public int addObject(SmsEmail mob) throws PlatformException {
        return smsEmailMapper.insert(mob);
    }

    @Override
    public int deleteObjectById(int id) throws PlatformException {
        return smsEmailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateObject(SmsEmail mob) throws PlatformException {
        return 0;
    }

    @Override
    public SmsEmail getObjectById(int id) {
        return smsEmailMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageVo<SmsEmail> getPageVoObject(PageVo<SmsEmail> pageVo) {
        return null;
    }

    @Override
    public PageVo<SmsEmail> getPageVoByObject(PageVo<SmsEmail> pageVo, SmsEmail smsEmail) {

        List<SmsEmail> list = new ArrayList<>();

        // step1: 查询当前总记录条数
        int recordCount = smsEmailMapper.selectCountByAll();
        pageVo.setRecordCount(recordCount);

        // step2: 开始位置
        int offset = pageVo.getCurrentPage()-1<1?0:pageVo.getCurrentPage()-1;
        // step3: 结果集
        list = smsEmailMapper.selectListByPaging(pageVo.getPageSize()*offset,pageVo.getPageSize());
        pageVo.setVoList(list);

        return pageVo;
    }

    @Override
    public PageVo<SmsEmail> getPageVoByMap(PageVo<SmsEmail> pageVo, Map<String, Object> map) {
        return null;
    }

    @Override
    public List<SmsEmail> getAllObject() {
        return null;
    }

    @Override
    public Cursor<SmsEmail> getCursorByObject(SmsEmail mob) {
        return null;
    }

    @Override
    public Cursor<SmsEmail> getCursorByMap(Map<String, Object> map) {
        return null;
    }



    @Override
    public void sendMail(SmsEmail smsEmail) throws PlatformException {

        // step1: 插入邮件信息
        int resultId = addObject(smsEmail);

        // step2: 发送邮件
        Mail mailToBeSend = new Mail(smsEmail.getToEmail(), smsEmail.getContent(), null, smsEmail.getSubject(), EmailTypeEnum.getEmailType(smsEmail.getEmailType()));
        if(StringUtils.isBlank(smsEmail.getToEmail())){
            return ;
        }
        if (smsEmail.getEmailType().equals(EmailTypeEnum.REG_PASSWD))
        {
            TaskProducer.addHighPriorMail(mailToBeSend, true);
        } else {
            TaskProducer.addNormalPriorMail(mailToBeSend, true);
        }

    }

    @Override
    public void sendMail(EmailTypeEnum type, String toAddress, String subject, String content) {
        Mail mailToBeSend = new Mail(toAddress, content, null, subject, type);
        if(toAddress==null||"".equals(toAddress.trim())){
            return ;
        }
        if (type.equals(EmailTypeEnum.REG_PASSWD))
        {
            TaskProducer.addHighPriorMail(mailToBeSend, true);
        } else {
            TaskProducer.addNormalPriorMail(mailToBeSend, true);
        }
    }
}
