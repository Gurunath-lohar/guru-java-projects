package com.guru.main;

import com.guru.singleton.Singleton;

public class Main {
	public static void main(String args [])
	{
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		if(sg1 == sg2)
			System.out.println("Both instances are same, hence single instance present");
	}
}
