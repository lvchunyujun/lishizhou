package com.lcyj.sms.service.message.impl.producer;

import com.lcyj.sms.common.SpringContextUtil;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.DependsOn;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@DependsOn("springContextUtil")
public class RecoverExecutor
{
    private static ScheduledExecutorService recoverExecutorService;

    // 每次Recover的时间间隔，单位分钟
    private int interval;
    
    //第一次启动Recover的延迟时间，单位分钟
    private int initialDelay;
    
    private static Logger logger = Logger.getLogger(RecoverExecutor.class);

    /**
     * 开始恢复线程
     */
    public void startRecover()
    {
        logger.info("startRecover()  开始启动Recover线程池");
        if (recoverExecutorService == null || recoverExecutorService.isShutdown()
                || recoverExecutorService.isTerminated())
        {
            recoverExecutorService = Executors.newScheduledThreadPool(1);
        }
        recoverExecutorService.scheduleAtFixedRate(new RecorverThread(), initialDelay, interval,
                TimeUnit.MINUTES);
        logger.info("Recover线程池初始化成功, 将在"+initialDelay+"分钟后启动线程，每"+interval+"分钟运行一次");
    }
    
    /**
     * 取得Recover线程的线程池
     * 
     * @return
     */
    public static RecoverExecutor getInstance()
    {
        return (RecoverExecutor)SpringContextUtil.getBean("recoverExecutor");
    }
    

    /**
     * Spring注入每次Recover的时间间隔
     * @param interval the interval to set
     */
    public void setInterval(int interval)
    {
        this.interval = interval;
    }

    /**
     * Spring注入第一次启动Recover的延迟时间，单位分钟
     * @param initialDelay the initialDelay to set
     */
    public void setInitialDelay(int initialDelay)
    {
        this.initialDelay = initialDelay;
    }
}
