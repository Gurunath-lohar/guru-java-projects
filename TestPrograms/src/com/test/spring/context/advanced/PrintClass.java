package com.test.spring.context.advanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PrintClass {
	@Autowired
	TestBean testBean;
	@Autowired
	NextClass nc;	
	
	public void printBeanValues()
	{		
		System.out.println("Initial values : Name :"+testBean.getName()+ 
				"  Id :"+testBean.getId());
		testBean.setId(48);
		testBean.setName("Lohar");
		nc.printNewBeanValues();
	}
}
