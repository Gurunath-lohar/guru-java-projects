package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
	public static void main(String [] args)
	{
		Object o = new SampleLogic(5,"Test");
		String className  = o.getClass().getName();
		Method[] methods = SampleLogic.class.getMethods();
		Constructor[] ctrs = SampleLogic.class.getConstructors();
		System.out.println("constructors");
		for(Constructor c : ctrs)
		{
			System.out.println(c.getName());
		}
		System.out.println("methods");
		for(Method m : methods)
		{
			System.out.println(m.getName());
		}
	}
}
