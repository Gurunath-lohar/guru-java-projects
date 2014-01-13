package com.guru.implementation;

import com.guru.api.WriteToDisplay;

public class ConsoleLowercaseDisplay implements WriteToDisplay {

	@Override
	public void writeToDisplay(String s) {
		System.out.println("Lowercase Display :"+(s.toLowerCase()));
	}
}
