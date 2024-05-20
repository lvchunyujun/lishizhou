package com.lcyj.sms.service.message.impl.consumer.impl;

import com.lcyj.sms.common.SpringContextUtil;
import com.lcyj.sms.service.message.impl.consumer.AbstractTaskConsumer;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池，其中的线程从短信队列中取待发送的SMS对象
 * 
 * @version 1.0
 */
@DependsOn("springContextUtil")
@Service("smsConsumer")
public class SMSConsumer extends AbstractTaskConsumer
{

    private static Logger logger = Logger.getLogger(SMSConsumer.class);

    // 初始化短信client用
    private String serialNumber;

    // 初始化短信client用
    private String key;

    private ScheduledExecutorService executorService;

    /**
     * 9点，最早允许发送短信的时间
     */
    public final static int START_SEND_HOUR = 9;

    /**
     * 21点，最晚允许发送短信的时间
     */
    public final static int END_SEND_HOUR = 21;

    /**
     * 启动短信Consumer的线程池
     * message
     */
    public void startConsume()
    {
        logger.info("开始启动短信发送线程池");
        if (executorService == null || executorService.isShutdown() || executorService.isTerminated())
        {
            executorService = Executors.newScheduledThreadPool(consumer_thread_number);
            for (int i = 1; i < (consumer_thread_number + 1); i++)
            {
                // 此处initialDelay是i，单位秒
                executorService.scheduleWithFixedDelay(new SMSConsumerThread(i, serialNumber, key), 0, interval,
                        TimeUnit.SECONDS);
            }
            logger.info("短信发送线程池初始化成功, 共含" + consumer_thread_number + "线程, 每" + interval + "秒钟轮询队列一次");
        }
        
    }

    /**
     * 取得短信Consumer的线程池
     * 
     * @return
     */
    public static SMSConsumer getInstance()
    {
        return (SMSConsumer)SpringContextUtil.getBean("smsConsumer");
    }

    /**
     * Spring注入用
     * 
     * @param serialNumber
     *            the serialNumber to set
     */
    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    /**
     * Spring注入用
     * 
     * @param key
     *            the key to set
     */
    public void setKey(String key)
    {
        this.key = key;
    }

    /**
     * @return the executorService
     */
    public ScheduledExecutorService getExecutorService()
    {
        return executorService;
    }

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getKey() {
		return key;
	}

}
