package com.test.spring.context.conventional;

public class LastClass {
	TestBean testBean;
	public void printNewBeanValues()
	{
		System.out.println("New values : Name :"+testBean.getName()+ 
				"  Id :"+testBean.getId());
	}
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
}
