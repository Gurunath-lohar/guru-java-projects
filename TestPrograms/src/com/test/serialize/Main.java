package com.test.serialize;

public class Main {
	public static void main(String [] args)
	{
		TestCases testCases = new TestCases();
		//testCases.testNormalSerializeDeserialize();
		//testCases.testSerializedInheritance();
		testCases.testNonSerializedInheritance();
	}
}
