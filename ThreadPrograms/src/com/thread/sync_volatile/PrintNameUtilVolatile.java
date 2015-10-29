package com.thread.sync_volatile;

public class PrintNameUtilVolatile implements IPrintUtil{
	
	private volatile boolean done;
	
	public void printNames()
	{
		while(!done)
		{
			System.out.println("hello Guru");
		}
		System.out.println("Exiting");			
	}
	
	public void setDone(boolean done)
	{
		this.done = done;
	}
	
}
