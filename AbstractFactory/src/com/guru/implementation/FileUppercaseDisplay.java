package com.guru.implementation;

import com.guru.api.WriteToDisplay;

public class FileUppercaseDisplay implements WriteToDisplay {

	@Override
	public void writeToDisplay(String s) {
		System.out.println("File Uppercase Display :"+(s.toUpperCase()));
	}

}
