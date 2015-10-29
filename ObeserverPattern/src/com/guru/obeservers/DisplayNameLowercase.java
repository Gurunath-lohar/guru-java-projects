package com.guru.obeservers;

import java.util.Observable;
import java.util.Observer;

public class DisplayNameLowercase implements Observer{
	public void update(Observable observable, Object o)
	{
		String name = (String) o;
		displayName(name);
	}
	private void displayName(String name)
	{
		System.out.println("The Display Name in Lowercase :"+name.toLowerCase());
	}
}
