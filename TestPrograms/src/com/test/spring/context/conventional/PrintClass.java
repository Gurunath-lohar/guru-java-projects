package com.test.spring.context.conventional;

import java.util.List;
import java.util.Map;

public class PrintClass {
	TestBean testBean;
	NextClass nc;
	List ls;
	Map map;
	int a;
	public PrintClass(int i, String name )
	{
		a=i;
	}
	public void printBeanValues()
	{		
		System.out.println("Initial values : Name :"+testBean.getName()+ 
				"  Id :"+testBean.getId()+ "  list size :"+ls.size()+ 
				"  Map size :"+map.size());
		testBean.setId(a);
		testBean.setName("Lohar");
		nc.printNewBeanValues();
	}
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
	public void setNc(NextClass nc) {
		this.nc = nc;
	}
	public List getLs() {
		return ls;
	}
	public void setLs(List ls) {
		this.ls = ls;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
}
