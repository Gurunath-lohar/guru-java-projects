package com.guru.implementation;

import com.guru.api.Display;

public class UppercaseDisplay implements Display {

	@Override
	public void writeToConsole(String s) {
		System.out.println("Uppercase Display :"+(s.toUpperCase()));
	}

}
