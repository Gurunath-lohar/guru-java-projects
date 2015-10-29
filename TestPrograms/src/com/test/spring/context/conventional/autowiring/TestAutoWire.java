package com.test.spring.context.conventional.autowiring;


public class TestAutoWire {
	TestBean testBean;
	int a=10;
	public TestAutoWire()
	{
		
	}
	public TestAutoWire(int i, TestBean testBean )
	{
		a=i;
		this.testBean = testBean;
	}
	public TestAutoWire(TestBean testBean )
	{		
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
