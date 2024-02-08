package com.tdtech.scorecard.api.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@Aspect
public class AspectConfig {
    
    @Before(value="execution(* com.tdtech.scorecard.api..controller.*.*(..))")
    public void beforeAdviceTraceLogging(JoinPoint joinPoint) {
        log.info(String.format("Controller: %s(%s)", joinPoint.getSignature().getName(), joinPoint.getArgs()));
    }
}
