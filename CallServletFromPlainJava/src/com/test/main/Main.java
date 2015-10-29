package com.test.main;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;

import com.test.TestBean;

public class Main {
	
	public static void main(String [] args)
	{
		Main m = new Main();
		m.callServlet();
	}
	/* IMPORTANT NOTE 
	 * Use only doPost() in the servlet, or call doPost() from within doGet()
	 * But NEVER use doGet() alone, since it will not handle non browser requests like below
	 * Else use service() method which is best option if you're unable to decide
	 */
	private void callServlet()
	{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		URLConnection con = null;
		URL url = null;
		TestBean tb = new TestBean();
		tb.setId(25);
		tb.setName("Gurunath");
		try{
			url = new URL("http://localhost:8808/TestWebApplication/ExampleServlet");
			con = url.openConnection();
			con.setDoOutput(true);
			con.setDoInput(true);
			oos = new ObjectOutputStream( con.getOutputStream());
			oos.writeObject(tb);
			oos.flush();
			oos.close();
			
			ois = new ObjectInputStream( con.getInputStream());
			TestBean tb1 = (TestBean)ois.readObject();
			System.out.println("Response from server ID :"+tb1.getId()+"   Name :"+tb1.getName());
			ois.close();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}	
}
