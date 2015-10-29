package com.guru.components;

public class PlainCoffee extends AbstractComponent{
	@Override
	public String getDescription()
	{
		return "Plain Coffee";
	}
	
	@Override
	public double getCost()
	{
		return 2.5;
	}
}
