package com.test.spring.context.advanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LastClass {
	@Autowired
	TestBean testBean;
	public void printNewBeanValues()
	{
		System.out.println("New values : Name :"+testBean.getName()+ 
				"  Id :"+testBean.getId());
	}
}
