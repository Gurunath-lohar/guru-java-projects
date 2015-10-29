package com.test.association;

import com.test.association.TestCases;

public class Main {
	public static void main(String [] args)
	{
		TestCases testCases = new TestCases();	
		//testCases.testLazyLoadOperation();
		//testCases.testOuterJoinOperation();
		//testCases.testNormalOuterJoinOperation();
		//testCases.testSelectNormalOuterJoinOperation();
		testCases.testImplicitJoinOperation();
	}
}
