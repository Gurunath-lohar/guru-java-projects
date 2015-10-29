package com.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleServlet
 */
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ExampleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletInputStream sis = request.getInputStream();
		ServletOutputStream sos = response.getOutputStream();
		ObjectInputStream ois = new ObjectInputStream(sis);
		ObjectOutputStream oos = new ObjectOutputStream(sos);
		try{
			TestBean tb = (TestBean)ois.readObject();
			System.out.println("@ Serverside ID :"+tb.getId()+"   Name :"+tb.getName());
			//tb.setId(35);
			tb.setName("Mihit");
			oos.writeObject(tb);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		finally{
			ois.close();
			oos.close();
			sis.close();
			sos.close();			
		}
	}
	/*public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}*/
}
