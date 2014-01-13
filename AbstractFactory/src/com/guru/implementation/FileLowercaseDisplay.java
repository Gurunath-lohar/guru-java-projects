package com.guru.implementation;

import com.guru.api.WriteToDisplay;

public class FileLowercaseDisplay implements WriteToDisplay {

	@Override
	public void writeToDisplay(String s) {
		System.out.println("File Lowercase Display :"+(s.toLowerCase()));
	}
}
