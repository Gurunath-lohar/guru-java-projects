package com.thread.sync_volatile;

public class PrintNameUtilSync implements IPrintUtil{
	
	private boolean done;
	
	public void printNames()
	{
		while(!getDone())
		{
			System.out.println("hello Guru");
		}
		System.out.println("Exiting");			
	}
	
	public synchronized void setDone(boolean done)
	{
		this.done = done;
	}
	public synchronized boolean getDone()
	{
		return this.done;
	}
}
