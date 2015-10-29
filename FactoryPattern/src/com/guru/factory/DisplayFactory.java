package com.guru.factory;

import com.guru.api.Display;
import com.guru.implementation.LowercaseDisplay;
import com.guru.implementation.UppercaseDisplay;

public class DisplayFactory {
	private static DisplayFactory displayFactory;
	private DisplayFactory()
	{
		
	}
	public static DisplayFactory getInstance()
	{
		if(displayFactory == null)
			displayFactory = new DisplayFactory();			 
		return displayFactory;
	}
	public Display getDisplay(String type)
	{
		Display display =null;
		if(type.equals("upper"))
			display = new UppercaseDisplay();
		else if(type.equals("lower"))
			display = new LowercaseDisplay();
		return display;
	}
}
