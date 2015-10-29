package com.guru.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.guru.classes.Sample1;
import com.guru.classes.Sample2;

public class ProxyInvocationHandler implements InvocationHandler{
	private String name = null;
	private String id = null;
	Sample1 s1 = null;
	public ProxyInvocationHandler(Sample1 s1)
	{
		this.s1 = s1;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
	{
		
		if(method.getName().equals("setName"))
		{
			name = (String)args[0];
		}
		else if(method.getName().equals("getName"))
		{
			try {
				name = (String)method.invoke(s1, args);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return name;
		}
		else if(method.getName().equals("setId"))
		{
			id = (String)args[0];
		}
		else if(method.getName().equals("getId"))
		{
			return id;
		}
		return null;
	}

}
