package com.thread.sync_volatile;

public class Thread2 extends Thread {
	private IPrintUtil pu;
	public Thread2(IPrintUtil pu)
	{
		this.pu = pu;
	}
	public void run()
	{
		pu.setDone(true);
	}
}
