package com.guru.main;

import com.guru.obeservable.TestObeservable;
import com.guru.obeservers.DisplayNameLowercase;
import com.guru.obeservers.DisplayNameUppercase;

public class Main {
	public static void main(String [] args)
	{
		String [] displayValues = new String[]{"Gurunath","Lohar"};
		TestObeservable testObeservable = new TestObeservable();
		DisplayNameLowercase lowerObserver = new DisplayNameLowercase();
		DisplayNameUppercase upperObserver = new DisplayNameUppercase();
		testObeservable.addObserver(lowerObserver);
		testObeservable.addObserver(upperObserver);
		System.out.println("All Observers added");
		for(String s : displayValues)
		{
			testObeservable.setChanged(s);
		}
		testObeservable.deleteObserver(upperObserver);
		System.out.println("Uppercase Observer deleted");
		for(String s : displayValues)
		{
			testObeservable.setChanged(s);
		}
	}
}
