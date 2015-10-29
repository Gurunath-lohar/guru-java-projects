package com.test.generics;

public class Main {
	public static void main(String args[])
	{
		ClassA<String> classAWithGen = new ClassA<String>("Hello");
		ClassA classAWithoutGen = new ClassA("Without Gen");
		classAWithGen.printT();
		classAWithoutGen.printT();
		ClassA<String> classAWithGen1 = new ClassB<String>("Hello");
		classAWithGen1.printSub("In override");
		ClassA classAWithoutGen1 = new ClassB(23);
		classAWithoutGen1.printSub(45);
	}
}
