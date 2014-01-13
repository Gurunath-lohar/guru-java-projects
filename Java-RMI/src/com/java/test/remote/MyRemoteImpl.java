package com.java.test.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	public MyRemoteImpl()throws RemoteException{
		
	}
	@Override
	public String sayHello() {		
		return "Server says, Hi";
	}
	public static void main(String [] args){
		try {
			MyRemote myRemote = new MyRemoteImpl();
			Naming.rebind("RemoteService", myRemote);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
