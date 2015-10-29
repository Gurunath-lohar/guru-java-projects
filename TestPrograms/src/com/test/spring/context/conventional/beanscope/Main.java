package com.test.spring.context.conventional.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/context/conventional/beanscope/beans.xml");
		TestScope printClass = (TestScope)context.getBean("testScope");		
		printClass.printBeanValues();
	}
}
