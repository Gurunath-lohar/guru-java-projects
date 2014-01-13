package com.test.spring.context.conventional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/context/conventional/beans.xml");
		PrintClass printClass = (PrintClass)context.getBean("printClass");		
		printClass.printBeanValues();
	}
}
