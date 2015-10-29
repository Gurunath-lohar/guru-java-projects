package com.guru.factories;

import com.guru.api.DisplayFactory;
import com.guru.api.WriteToDisplay;
import com.guru.implementation.FileLowercaseDisplay;
import com.guru.implementation.FileUppercaseDisplay;

public class FileDisplayFactory implements DisplayFactory{
	public WriteToDisplay getDisplay(String type)
	{
		WriteToDisplay display =null;
		if(type.equals("upper"))
			display = new FileUppercaseDisplay();
		else if(type.equals("lower"))
			display = new FileLowercaseDisplay();
		return display;
	}
}
