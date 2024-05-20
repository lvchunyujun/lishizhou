package com.lcyj.sms.service.message.impl.queue;

import org.springframework.stereotype.Component;

@Component
public class SMSQueue extends AbstractTaskQueue
{

    private static final long serialVersionUID = 7523844113171678946L;
    
    
    private static SMSQueue instance;

    public static SMSQueue getInstance()
    {
        if (instance == null)
        {
            instance = new SMSQueue();
        }
        return instance;
    }
}
