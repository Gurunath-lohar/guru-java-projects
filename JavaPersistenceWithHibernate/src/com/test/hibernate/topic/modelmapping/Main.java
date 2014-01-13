package com.test.hibernate.topic.modelmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.topic.modelmapping.model.Employee;
import com.test.hibernate.util.HibernateUtil;

public class Main {
	public static void main(String args[])
	{
		SessionFactory sf = HibernateUtil.getSessionFactiory("com.test.hibernate.topic.modelmapping.model.Employee");
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee ev1 = (Employee) session.get(Employee.class, "555");
		System.out.println("Employee loaded via get :"+ev1.getEmp_name());
		tx.commit();
		session.close();
	}
}
