package com.guru.main;

import com.guru.api.DisplayFactory;
import com.guru.api.WriteToDisplay;
import com.guru.factories.Display;

public class Main {
	public static void main(String [] args)
	{
		Display d = Display.getInstance();
		DisplayFactory dc = d.getDisplayFactory("console");
		DisplayFactory dfile = d.getDisplayFactory("file");
		WriteToDisplay du = dc.getDisplay("upper");
		WriteToDisplay dl = dc.getDisplay("lower");
		du.writeToDisplay("Hello Java Factory Pattern");
		dl.writeToDisplay("Hello Java Factory Pattern");
		du = dfile.getDisplay("upper");
		dl = dfile.getDisplay("lower");
		du.writeToDisplay("Hello Java Factory Pattern");
		dl.writeToDisplay("Hello Java Factory Pattern");
	}
}
