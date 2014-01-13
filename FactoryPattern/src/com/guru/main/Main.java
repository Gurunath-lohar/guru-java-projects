package com.guru.main;

import com.guru.api.Display;
import com.guru.factory.DisplayFactory;

public class Main {
	public static void main(String [] args)
	{
		DisplayFactory df = DisplayFactory.getInstance();
		Display du = df.getDisplay("upper");
		Display dl = df.getDisplay("lower");
		du.writeToConsole("Hello Java Factory Pattern");
		dl.writeToConsole("Hello Java Factory Pattern");
	}
}
