package com.test.spring.context.advanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class NextClass {
	@Autowired
	TestBean testBean;
	@Autowired
	LastClass lc;
	public void printNewBeanValues()
	{
		System.out.println("New values : Name :"+testBean.getName()+ 
				"  Id :"+testBean.getId());
		testBean.setId(50);
		testBean.setName("Guru");
		lc.printNewBeanValues();
	}
}
