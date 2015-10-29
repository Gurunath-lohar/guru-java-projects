package com.test.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestCases {
	public void testNormalSerializeDeserialize()
	{
		Bean1 bean = new Bean1();
		bean.setId(234);
		bean.setName("Normal Serialize and Deserialize");
		writeToFile(bean);
		Bean1 bean1 = (Bean1)readFromFile();
		System.out.println("ID :"+bean1.getId()+"   Name :"+bean1.getName());
	}
	public void testSerializedInheritance()
	{
		Bean3 bean3 = new Bean3("serialized inheritance", 456);
		bean3.setAddress("Bangalore");
		writeToFile(bean3);
		Bean3 bean33 = (Bean3)readFromFile();
		System.out.println("ID :"+bean33.getId()+"   Name :"+bean33.getName()+"  Address :"+bean33.getAddress());
	}
	public void testNonSerializedInheritance()
	{
		Bean5 bean5 = new Bean5("non serialzed inheritance", 456);
		bean5.setAddress("Bangalore");
		writeToFile(bean5);
		Bean5 bean55 = (Bean5)readFromFile();
		System.out.println("ID :"+bean55.getId()+"   Name :"+bean55.getName()+"  Address :"+bean55.getAddress());
	}
	private void writeToFile(Object o)
	{
		File file = new File("Serialize.obj");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			file.createNewFile();
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private Object readFromFile()
	{
		Object o = null;
		File file = new File("Serialize.obj");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			o = ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return o;
	}
}
