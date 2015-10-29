package com.test.objecttest;

public class ClassA {
	private static ClassA classA;
	private ClassA(){
		
	}
	public static ClassA getInstance()
	{
		if(classA == null)
		{
			classA = new ClassA();
		}
		return classA;
	}
}
