package com.test.spring.aop;

import org.aopalliance.intercept.Joinpoint;


public class TestAdvice {
	public void callBeforeMethod(Joinpoint joinPoint){
		System.out.println("Called before method Invocation");
	}
}
