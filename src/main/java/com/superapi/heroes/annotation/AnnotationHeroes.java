package com.superapi.heroes.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author David Garcia 26/9/2021
 */
@Aspect
@Component
public class AnnotationHeroes {
    private static final Logger logger = LoggerFactory.getLogger(AnnotationHeroes.class);

    @Around("@annotation(com.superapi.heroes.annotation.CustomHeroes)")
    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
        Long time_start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        Long time_end = System.currentTimeMillis();
        logger.info("-- Anotacion imprime el Tiempo de ejecucion "+ ( time_end - time_start ) +" milliseconds");
        return result;
    }
}
