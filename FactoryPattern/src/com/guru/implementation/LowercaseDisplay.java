package com.guru.implementation;

import com.guru.api.Display;

public class LowercaseDisplay implements Display {

	@Override
	public void writeToConsole(String s) {
		System.out.println("Lowercase Display :"+(s.toLowerCase()));
	}
}
