package com.test.innnerclass;

public class TestOuterInner {
	
	public class Inner
	{
		String name;
		public Inner(String name)
		{
			this.name = name;
		}
		public void printName()
		{
			System.out.println(name);
		}
	}
	public Inner getInner()
	{
		return new Inner("Guru");
	}
	public void testObject()
	{
		Inner in = new TestOuterInner().getInner();
		Inner in1 = new Inner("");
	}
}
