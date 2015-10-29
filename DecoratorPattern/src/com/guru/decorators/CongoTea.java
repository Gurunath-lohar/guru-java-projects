package com.guru.decorators;

import com.guru.components.AbstractComponent;

public class CongoTea extends AbstractDecorator {
	AbstractComponent component = null;
	public CongoTea(AbstractComponent component)
	{
		this.component = component;
	}
	@Override
	public String getDescription()
	{
		return (component.getDescription()+" with added flavor Congo Tea");
	}
	
	@Override
	public double getCost()
	{
		return (1.25+component.getCost());
	}
}
