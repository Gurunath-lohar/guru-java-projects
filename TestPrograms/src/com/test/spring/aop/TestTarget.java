package com.test.spring.aop;

public class TestTarget implements ITestTarget {
	/* (non-Javadoc)
	 * @see com.test.spring.aop.ITestTarget#printName()
	 */
	public TestTarget()
	{
		
	}
	public void printName()
	{
		System.out.println("Test AOP");
	}
}
