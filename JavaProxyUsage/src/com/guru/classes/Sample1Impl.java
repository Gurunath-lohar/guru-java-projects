package com.guru.classes;

public class Sample1Impl implements Sample1 {
	String name;
	public String getName() {
		
		return "From Proxied Class";
	}

	public void setName(String name) {
		this.name=name;
	}

}
