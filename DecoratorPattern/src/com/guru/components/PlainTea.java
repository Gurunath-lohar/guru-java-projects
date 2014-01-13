package com.guru.components;

public class PlainTea extends AbstractComponent {

	@Override
	public double getCost() {
		return 1.50;
	}

	@Override
	public String getDescription() {
		return "Plain Tea";
	}

}
