package com.test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/aop/beans.xml");
		ITestTarget printClass = (ITestTarget)context.getBean("testTarget");		
		printClass.printName();
	}
}
