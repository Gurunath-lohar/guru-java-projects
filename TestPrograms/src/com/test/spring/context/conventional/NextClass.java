package com.test.spring.context.conventional;

public class NextClass {
	TestBean testBean;
	LastClass lc;
	public void printNewBeanValues()
	{
		System.out.println("New values : Name :"+testBean.getName()+ 
				"  Id :"+testBean.getId());
		testBean.setId(50);
		testBean.setName("Guru");
		lc.printNewBeanValues();
	}
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
	public void setLc(LastClass lc) {
		this.lc = lc;
	}
}
