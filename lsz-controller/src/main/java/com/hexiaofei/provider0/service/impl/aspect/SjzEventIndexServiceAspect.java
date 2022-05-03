package com.hexiaofei.provider0.service.impl.aspect;

import com.hexiaofei.provider0.domain.LszTag;
import com.hexiaofei.provider0.domain.SjzEventIndex;
import com.hexiaofei.provider0.service.ILszTagService;
import com.hexiaofei.provider0.vo.PageVo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author lcyj
 * @date 2021-04-11 21:28
 * @since
 */
@Aspect
@Component
public class SjzEventIndexServiceAspect {

    @Autowired
    private ILszTagService lszTagService;



    @Pointcut("execution(int com.hexiaofei.provider0.service.impl.SjzEventIndexServiceImpl.updateObject(com.hexiaofei.provider0.domain.SjzEventIndex,com.hexiaofei.provider0.domain.LszTag))")
    private void selectGetAge(){}

    @Around("selectGetAge()")
    public int aroundMethod(ProceedingJoinPoint proceedingJoinPoint){


       Object[] args = proceedingJoinPoint.getArgs();

        SjzEventIndex mob = (SjzEventIndex)args[0];
        LszTag lszTag = (LszTag)args[1];



        System.out.println("共有几个参数: "+args.length);
        try {
            if(lszTag != null && lszTag.getRecordId() > 0){

                LszTag oldLszTag = lszTagService.getLszTag(lszTag);

                System.out.println(oldLszTag);

                proceedingJoinPoint.proceed();
            }

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return -1;
    }
}
