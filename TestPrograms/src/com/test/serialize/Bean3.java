package com.test.serialize;

import java.io.Serializable;

public class Bean3 extends Bean2 implements Serializable{
	private static final long serialVersionUID = 1L;
	String address;
	public Bean3(String name, int id)
	{
		super(name,id);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
