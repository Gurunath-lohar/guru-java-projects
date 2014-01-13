package com.test.spring.context.conventional.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/context/conventional/autowiring/beans.xml");
		TestAutoWire printClass = (TestAutoWire)context.getBean("testAutoWire");		
		printClass.printBeanValues();
	}
}
