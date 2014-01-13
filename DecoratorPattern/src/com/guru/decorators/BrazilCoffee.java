package com.guru.decorators;

import com.guru.components.AbstractComponent;

public class BrazilCoffee extends AbstractDecorator{
	AbstractComponent component = null;
	public BrazilCoffee(AbstractComponent component)
	{
		this.component = component;
	}
	@Override
	public String getDescription()
	{
		return (component.getDescription()+" with added flavor Brazil Coffee");
	}
	
	@Override
	public double getCost()
	{
		return (1.5+component.getCost());
	}
}
