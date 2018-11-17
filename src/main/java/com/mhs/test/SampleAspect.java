package com.mhs.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import com.mhs.CommonController;

public class SampleAspect {

	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	public void afterReturningAdvice(JoinPoint joinpoint, Object obj) {
		logger.info("afterReturningAdvice: " + joinpoint.getSignature().getName() + " - " + obj.toString());
	}
	
	public void afterThrowingAdvice(JoinPoint joinPoint, Throwable exception) {
		logger.info("afterThrowingAdvice: " + joinPoint.getSignature().getName() + " - " + exception.toString());
	}

	public void afterAdvice(JoinPoint joinPoint) {
		logger.info("afterAdvice: " + joinPoint.getSignature().getName());
	}
	
	public Object aroundAdvice(ProceedingJoinPoint point) {
		Object o = null;
		StopWatch watch = new StopWatch();
		watch.start();
		try {
			o = point.proceed();
		} catch (Throwable throwable) {
		}
		watch.stop();
		logger.info("aroundAdvice: " + watch.prettyPrint());
		return o;
	}
	
}
