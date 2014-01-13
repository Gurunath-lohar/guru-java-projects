package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassB<T> extends ClassA<T>{
	T subType;
	public ClassB(T t)
	{
		super(t);
		subType = t;	
		List ls = new ArrayList<Integer>();
		ls.add("");
	}
	
	@Override
	public void printSub(T t)
	{
		System.out.println("In the sub class  :"+t);
	}
}
