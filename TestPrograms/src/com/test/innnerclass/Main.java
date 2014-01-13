package com.test.innnerclass;

public class Main {
	public static void main(String [] args)
	{
		Main main = new Main();
		main.testOuterInner();
	}
	public void testOuterInner()
	{
		TestOuterInner toi = new TestOuterInner();
		TestNestedInner.Inner in= new TestNestedInner().new Inner("");
	}
}
