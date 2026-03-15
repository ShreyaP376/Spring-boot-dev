package com.example.demo.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {

	@AfterThrowing(pointcut = "execution(* com.example.demo.*.*.*(..))", throwing = "e")
	public void printExpection(RuntimeException e) {
		System.out.println("Exception thrown  "+e.getMessage());
	}
}
