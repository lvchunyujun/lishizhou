package com.lcyj.sms.service.message.impl.consumer;


import org.springframework.beans.factory.annotation.Value;

/**
 * @version 1.0
 */
public abstract class AbstractTaskConsumer
{

    @Value("${consumer_thread_number:4}")
    protected int consumer_thread_number;

    // 每个线程轮询队列的时间间隔
    @Value("${interval:10}")
    protected int interval;

    /**
     * 从队列中拿出一个Task，调用Adapter发送
     */
    public abstract void startConsume();



    /**
     * Spring注入线程数
     * 
     * @param consumer_thread_number
     *            the consumer_thread_number to set
     */
    public void setConsumer_thread_number(int consumer_thread_number)
    {
        this.consumer_thread_number = consumer_thread_number;
    }

    /**
     * Spring注入轮询queue间隔
     * 
     * @param interval
     *            the interval to set
     */
    public void setInterval(int interval)
    {
        this.interval = interval;
    }
}
