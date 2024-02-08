package com.tdtech.scorecard.api.aop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@Aspect
public class AspectConfig {
    
    @Before(value="execution(* com.tdtech.scorecard.api..controller.*.*(..))")
    public void beforeControllerAdviceLogging(JoinPoint jp) {
        log.info(String.format("Controller: %s(%s)", jp.getSignature().getName(), this.getParamsAsString(jp)));
    }

    private String getParamsAsString(JoinPoint jp) {
        String[] keys = ((MethodSignature) jp.getSignature()).getParameterNames();
        Object[] values = jp.getArgs();

        Map<String, Object> params = new HashMap<>();
        IntStream.range(0, keys.length).boxed().forEach(i -> params.put(keys[i], values[i]));
        
        return (params.size() > 0)?params.toString():"";
    }
}
