package com.thread.sync_volatile;

public class Main {
	public static void main(String [] args){
		IPrintUtil pu;
		//pu = new PrintNameUtilSync();
		//pu = new PrintNameUtilVolatile();
		pu = new PrintNameUtilWaitNotify();
		Thread1 t1 = new Thread1(pu);
		Thread2 t2 = new Thread2(pu);
		t1.start();
		/*try{
			Thread.sleep(1);
		}catch(Exception e)
		{
			
		}*/
		t2.start();
	}

}
