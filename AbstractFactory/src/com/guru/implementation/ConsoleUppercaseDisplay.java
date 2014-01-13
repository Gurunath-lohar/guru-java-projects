package com.guru.implementation;

import com.guru.api.WriteToDisplay;

public class ConsoleUppercaseDisplay implements WriteToDisplay {

	@Override
	public void writeToDisplay(String s) {
		System.out.println("Uppercase Display :"+(s.toUpperCase()));
	}

}
