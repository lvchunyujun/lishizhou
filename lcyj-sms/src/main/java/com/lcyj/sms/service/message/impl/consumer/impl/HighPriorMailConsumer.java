package com.lcyj.sms.service.message.impl.consumer.impl;

import com.lcyj.sms.service.message.impl.consumer.AbstractTaskConsumer;
import com.lcyj.sms.service.message.impl.queue.AbstractTaskQueue;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池，其中的线程从邮件队列中取待发送的Mail对象
 * 
 * @version 1.0
 */
@Service("highPriorMailConsumer")
public class HighPriorMailConsumer extends AbstractTaskConsumer
{

    private ScheduledExecutorService executorService;

    @Autowired
    private AbstractTaskQueue highPriorMailQueue;
    
    private static Logger logger = Logger.getLogger(HighPriorMailConsumer.class);
    
    /**
     * 启动普通优先级邮件Consumer的线程池
     *  message
     */
    public void startConsume()
    {
        logger.info("开始启动邮件发送线程池");
        
        if (this.executorService == null || executorService.isShutdown()
                || executorService.isTerminated())
        {
            executorService = Executors.newScheduledThreadPool(this.consumer_thread_number);

            for (int i = 1; i < (consumer_thread_number + 1); i++)
            {
                // 此处initialDelay是i，单位秒
                executorService.scheduleAtFixedRate(new MailConsumerThread(i, highPriorMailQueue), 0, interval,
                        TimeUnit.SECONDS);
            }
        }
        logger.info("邮件发送线程池初始化成功, 共含"+consumer_thread_number+"线程, 每"+interval+"秒钟轮询队列一次");
    }
    
    /**
     * @return the executorService
     */
    public ScheduledExecutorService getExecutorService()
    {
        return executorService;
    }

    /**
     * Spring注入queue
     * @param queue the queue to set
     */
    public void setHighPriorMailQueue(AbstractTaskQueue queue)
    {
        this.highPriorMailQueue = queue;
    }
    
}
