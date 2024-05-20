package com.lcyj.sms.service.message.impl.consumer.impl;

import com.lcyj.sms.model.FromAddress;
import com.lcyj.sms.model.mail.Mail;
import com.lcyj.sms.service.message.impl.adapter.mail.MailAdapterImpl;
import com.lcyj.sms.service.message.impl.adapter.mail.MailFromGenerator;
import com.lcyj.sms.service.message.impl.queue.AbstractTaskQueue;
import org.apache.log4j.Logger;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

/**
 * 邮件的consumer线程，从队列中取待发邮件，然后调用adapter发送
 * 
 * 
 */
public class MailConsumerThread implements Runnable
{
    private static Logger logger = Logger.getLogger(MailConsumerThread.class);

    private static Logger loggerMailAfterSucc = Logger.getLogger("mail_after_succ");
    private static Logger loggerMailAfterFail = Logger.getLogger("mail_after_fail");

    private MailAdapterImpl mailAdapter;

    private AbstractTaskQueue queue;

    private int thread_id;

    /**
     * 构造函数
     * 
     * @param thread_id
     */
    public MailConsumerThread(int thread_id, AbstractTaskQueue queue)
    {
        this.thread_id = thread_id;
        mailAdapter = new MailAdapterImpl();
        this.queue = queue;
        logger.info("邮件处理线程 " + thread_id + " 创建成功");
    }

    @Override
    public void run()
    {
        Mail mailFromQueue = (Mail) queue.take();

        logger.debug("线程" + thread_id + "  从队列取出邮件" + mailFromQueue);

        try
        {
            FromAddress randomFrom = MailFromGenerator.getRandomFromAddress();
            mailAdapter.setFrom(randomFrom.getAddress(), randomFrom.getDisplayName());
            mailAdapter.setSubject(mailFromQueue.getSubject());
            mailAdapter.setReplyTo(randomFrom.getAddress());
            mailAdapter.setBody(mailFromQueue.getContent());
            mailAdapter.setTo(mailFromQueue.getTo(), "");
            mailAdapter.setSMTPHost(randomFrom.getAddress(), randomFrom.getPassword());
            mailAdapter.setMailType(mailFromQueue.getType());
            mailAdapter.setTimeout(1000 * 30);
            mailAdapter.setSSLEnabled(true);
            mailAdapter.send();

            loggerMailAfterSucc.info(mailFromQueue.toBriefJSONString());

        } catch (MessagingException me) {
            logger.error("发送邮件时发生异常，id=" + mailFromQueue.getTaskID(), me);
            loggerMailAfterFail.info(mailFromQueue.toJSONString());
        } catch (UnsupportedEncodingException uee) {
            logger.error("发送邮件时遇到不支持的编码, 异常邮件id=" + mailFromQueue.getTaskID(), uee);
            loggerMailAfterFail.info(mailFromQueue.toJSONString());
        } catch (Exception e) {
            logger.error("发送邮件时发生异常, 异常邮件id=" + mailFromQueue.getTaskID(), e);
            loggerMailAfterFail.info(mailFromQueue.toJSONString());
        }
    }
}
