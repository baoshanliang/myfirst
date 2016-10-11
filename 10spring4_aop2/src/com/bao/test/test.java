package com.bao.test;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bao.service.userservice;

public class test {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		userservice userservice=(userservice)ap.getBean("userservice");
		userservice.add(2);
	}
	
}
