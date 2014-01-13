package com.thread.sync_volatile;

public class Thread1 extends Thread {
	private IPrintUtil pu;
	public Thread1(IPrintUtil pu)
	{
		this.pu = pu;
	}
	public void run()
	{
		pu.printNames();
	}
}
