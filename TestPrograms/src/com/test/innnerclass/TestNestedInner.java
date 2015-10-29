package com.test.innnerclass;


public class TestNestedInner {
	//Inner in2 = new TestNestedInner().new Inner(""); // gives compilation err
	Inner in1 = new Inner("");
	int id;
	public  class Inner
	{
		String name;
		public Inner(String name)
		{
			this.name = name;
		}
		public void printName()
		{
			//System.out.println(name+" "+id);// cannot access non-static member of outer class
		}
	}
	public void testObject()
	{
		Inner in1 = new Inner("");
	}
}
