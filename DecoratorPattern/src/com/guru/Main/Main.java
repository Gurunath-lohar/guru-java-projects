package com.guru.Main;

import com.guru.components.AbstractComponent;
import com.guru.components.PlainCoffee;
import com.guru.components.PlainTea;
import com.guru.decorators.AbstractDecorator;
import com.guru.decorators.BrazilCoffee;
import com.guru.decorators.CongoTea;

public class Main {
	public static void main(String [] args)
	{
		AbstractComponent component1 = new PlainCoffee();
		AbstractComponent component2 = new PlainTea();
		AbstractDecorator splCoffee = new BrazilCoffee(component1);
		AbstractDecorator splTea = new CongoTea(component2);
		
		System.out.println("Description :"+component1.getDescription()+"  Cost :"+component1.getCost());
		System.out.println("Description :"+splCoffee.getDescription()+"  Cost :"+splCoffee.getCost());
		System.out.println("Description :"+component2.getDescription()+"  Cost :"+component2.getCost());
		System.out.println("Description :"+splTea.getDescription()+"  Cost :"+splTea.getCost());
	}
}
