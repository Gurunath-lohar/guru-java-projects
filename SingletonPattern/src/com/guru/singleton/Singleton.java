package com.guru.singleton;

public class Singleton {
	private static Singleton singleton;
	private Singleton()
	{
		
	}
	synchronized public static Singleton getInstance()
	{
		if(singleton == null)
			singleton =  new Singleton();
		
		return singleton;
	}
}
