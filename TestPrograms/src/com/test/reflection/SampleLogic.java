package com.test.reflection;

public class SampleLogic {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SampleLogic(int id, String name)
	{
		this.id = id;
		this.name = name;		
	}
	public String getNameId()
	{
		return getAppended();
	}
	private String getAppended()
	{
		return name+id;
	}
	public static void getDetails()
	{
		
	}
}
