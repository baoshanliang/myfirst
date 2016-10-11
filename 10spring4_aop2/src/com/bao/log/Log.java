package com.bao.log;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

public class Log {
	
	public void before() {
		System.out.println("方法执行前执行");
		System.out.println("tesst");
	}
	public void after() {
		System.out.println("方法执行后");
		System.out.println("方法执行后");
	}
}
