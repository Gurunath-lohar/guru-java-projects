package com.thread.sync_volatile;

public class PrintNameUtilWaitNotify implements IPrintUtil{
	
	private boolean done;
	
	public synchronized void printNames()
	{
		while(! done)
		{
			System.out.println("hello Guru");
			try{
				wait();
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		System.out.println("Exiting");			
	}
	
	public synchronized void setDone(boolean done)
	{
		this.done = done;
		notify();
	}
}
