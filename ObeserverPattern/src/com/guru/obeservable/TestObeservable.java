package com.guru.obeservable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class TestObeservable extends Observable{
	List<Observer> observersList = new ArrayList<Observer>();
	public void addObserver(Observer o)
	{
		observersList.add(o);
	}
	public void deleteObserver(Observer o)
	{
		observersList.remove(o);
	}
	public void notifyObservers(String name)
	{
		for(Observer o : observersList)
		{
			o.update(this, name);
		}
	}
	public void setChanged(String name)
	{
		notifyObservers(name);
	}
}
