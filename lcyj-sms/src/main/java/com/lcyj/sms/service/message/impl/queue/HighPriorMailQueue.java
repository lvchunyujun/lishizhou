package com.lcyj.sms.service.message.impl.queue;


import org.springframework.stereotype.Service;

/**
 * 高优先级邮件的队列
 */
@Service("highPriorMailQueue")
public class HighPriorMailQueue extends MailQueue
{

    private static final long serialVersionUID = -972802808152063585L;

}
