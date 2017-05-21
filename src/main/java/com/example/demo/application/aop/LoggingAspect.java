package com.example.demo.application.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
	
	private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("execution(* *(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		log.info("logAround() is running!");
		log.debug("hijacked method : " + joinPoint.getSignature().getName());
		log.debug("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));

		log.debug("Around before is running!");
		joinPoint.proceed(); // continue on the intercepted method
		log.debug("Around after is running!");

		log.info("******");

	}
}
