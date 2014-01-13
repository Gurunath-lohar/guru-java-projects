package com.java.test.remote;
import java.rmi.Remote;;
public interface MyRemote extends Remote{
	public String sayHello();
}
