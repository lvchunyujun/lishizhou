package com.lcyj.sms.service.message.impl;

import com.lcyj.sms.common.EmailTypeEnum;
import com.lcyj.sms.model.mail.Mail;
import com.lcyj.sms.service.base.BaseService;
import com.lcyj.sms.service.message.IEmailService;
import com.lcyj.sms.service.message.impl.producer.TaskProducer;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * 向第三方发送消息的接口，包括邮件，短信，身份证绑定请求等
 * 
 * @version 1.0
 * @deprecated 最新 SmsEmailServiceImpl.java
 */
@Service
public class EmailServiceImpl extends BaseService implements IEmailService
{
    private static Logger logger = Logger.getLogger(EmailServiceImpl.class);
    
    private static File currentPositionFile;

    /**
     * 增加一个新邮件到发送队列中，等待被别的线程发送。
     * 
     * @param type
     *            邮件类型（注册激活，放标_流标_满标，成功还款等）
     * @param toAddress
     *            收件人地址
     * @param subject
     *            邮件标题
     * @param content
     *            邮件正文
     * @return true 表示添加到队列的操作成功
     */
    public void sendMail(EmailTypeEnum type, String toAddress, String subject, String content)
    {
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
