package com.thread.sleep;

public class TestThread extends Thread {
	public boolean stop;
	public TestThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		while(!stop)
		{
			System.out.println("thread running");
		}
		System.out.println("thread exiting");
	}

}
