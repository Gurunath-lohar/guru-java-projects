package com.thread.sleep;

public class Main {
	public static void main(String [] args)
	{
		TestThread t = new TestThread("testThread");
		t.start();		
		sleepThisThread();
		t.stop = true;
	}
	public static void sleepThisThread()
	{
		Thread t1 = Thread.currentThread();
		try{
			System.out.println("thread name :"+t1.getName());
			t1.sleep(100);
		}
		catch(Throwable t2)
		{
			t2.printStackTrace();
		}
	}
}
