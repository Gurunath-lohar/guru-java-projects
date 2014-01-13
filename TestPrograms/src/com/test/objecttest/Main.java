package com.test.objecttest;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	public static void main(String args [])
	{
		ClassA ca1 = ClassA.getInstance();
		ClassA ca2 = ClassA.getInstance();
		System.out.println("HashCode : ca1: "+ca1.hashCode()+"  ca2: "+ca2.hashCode()+
				"\nequals :"+ca1.equals(ca2));		
		ClassB cb1 = new ClassB();
		ClassB cb2 = new ClassB();
		System.out.println("HashCode : cb1: "+cb1.hashCode()+"  cb2: "+cb2.hashCode()+
				"\nequals :"+cb1.equals(cb2));
		CopyOnWriteArrayList ls = new CopyOnWriteArrayList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		Iterator it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			ls.add(4);
		}
		System.out.println("final size of list :"+ls.size());
		ConcurrentHashMap hm = new ConcurrentHashMap();
		hm.put("1", 1);
		hm.put("2", 2);
		Iterator itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			hm.put("3",3);
		}
	}
	public static void main(Integer arg[]){
		return ;
	}
}
