package com.test.spring.context.advanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/context/advanced/beans.xml");
		PrintClass printClass = (PrintClass)context.getBean("printClass");		
		printClass.printBeanValues();
	}
}
