package com.guru.main;

import java.lang.reflect.Proxy;

import com.guru.classes.Sample1;
import com.guru.classes.Sample1Impl;
import com.guru.classes.Sample2;
import com.guru.handler.ProxyInvocationHandler;

public class Main {
	public static void main(String args[])
	{
		Class [] classes = new Class []{Sample1.class, Sample2.class};
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(new Sample1Impl());
		Sample1 sample1 = (Sample1)Proxy.newProxyInstance(Main.class.getClassLoader(), classes, proxyInvocationHandler);
		Sample2 sample2 = (Sample2)Proxy.newProxyInstance(Main.class.getClassLoader(), classes, proxyInvocationHandler);
		sample1.setName("Gurunath Lohar");
		sample2.setId("2166");
		System.out.println("Employee Name :"+sample1.getName());
		System.out.println("Employee Id :"+sample2.getId());
	}
}
