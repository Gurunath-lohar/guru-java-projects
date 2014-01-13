package com.guru.factories;

import com.guru.api.DisplayFactory;
import com.guru.api.WriteToDisplay;
import com.guru.implementation.ConsoleLowercaseDisplay;
import com.guru.implementation.ConsoleUppercaseDisplay;

public class ConsoleDisplayFactory implements DisplayFactory{
	public WriteToDisplay getDisplay(String type)
	{
		WriteToDisplay display =null;
		if(type.equals("upper"))
			display = new ConsoleUppercaseDisplay();
		else if(type.equals("lower"))
			display = new ConsoleLowercaseDisplay();
		return display;
	}
}
