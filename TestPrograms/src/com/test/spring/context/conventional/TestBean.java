package com.test.spring.context.conventional;

import org.springframework.stereotype.Service;

@Service
public class TestBean {
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
