package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution (* com.example.demo.service.*.*(..))")
	public void beforeExecution() {
		System.out.println("method execution started");
	}
	
	@After("execution (* com.example.demo.service.*.*(..))")
	public void afterExecution() {
		System.out.println("method execution ended");
	}
	
	@Around("execution (* com.example.demo.*.*.*(..))")
	public Object aroundExecution(ProceedingJoinPoint p) throws Throwable {
		System.out.println("Start "+ p.getSignature());
		long start = System.currentTimeMillis();
		Object o = p.proceed();
		long end = System.currentTimeMillis();
		System.out.println("End "+p.getSignature());
		System.out.println(end - start);
		return o;			
	}
}
