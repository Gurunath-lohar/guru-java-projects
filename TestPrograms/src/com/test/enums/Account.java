package com.test.enums;

import java.util.Comparator;

public enum Account implements Comparator {
	accountType("defines type of account"), demat("equities trading account");
	private Account(String desc)
	{
		this.desc = desc;
	}
	public String desc = null;
	public static String name = "";
	public int compare(Object o1, Object o2)
	{
		return 0;
	}
	//static String name = "";
	public static String getName()
	{
		return name;
	}
}
