package com.test.spring.context.conventional.beanscope;


public class TestScope {
	TestBean testBean;
	int a=10;
	public TestScope(int i, TestBean testBean )
	{
		a=i;
		this.testBean = testBean;
	}
	
	public void printBeanValues()
	{		
		System.out.println("Initial values auto: Name :"+testBean.getName()+"  Id :"+a);		
	}
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
}
