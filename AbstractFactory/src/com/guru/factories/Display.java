package com.guru.factories;

import com.guru.api.DisplayFactory;

public class Display {
	private static Display display;
	private Display()
	{
		
	}
	public static Display getInstance()
	{
		if(display == null)
			display = new Display();			 
		return display;
	}
	public DisplayFactory getDisplayFactory(String type)
	{
		DisplayFactory displayFactory =null;
		if(type.equals("console"))
			displayFactory = new ConsoleDisplayFactory();
		else if(type.equals("file"))
			displayFactory = new FileDisplayFactory();
		return displayFactory;
	}
}
