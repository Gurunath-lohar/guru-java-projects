package com.test.serialize;

import java.io.Serializable;

public class Bean1 implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
