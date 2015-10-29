package com.test.generics;


public class ClassA<T> {
	private T a;
	private static int b2;
	/*public static T b; public static List<T> a1;
	 * generics cannot be used for static varibles*/
	/*public static List<T> b(){} generics cannot be used for static methods */
	public ClassA(T t)
	{
		this.a = t;
	}
	public void printT()
	{
		System.out.println("Value of T is  :"+a);
	}
	public void printSub(T t)
	{
		
	}
}
