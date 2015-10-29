package com.test.hb;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCases {
	private static SessionFactory sessionFactory;
	static{
		Properties properties = null;
		try{
			properties = new Properties();
			File file = new File("src/hibernate.properties");
			FileInputStream fis = new FileInputStream(file);
			properties.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Configuration config = new Configuration();
		config.setProperties(properties);
		config.addResource("com/test/hb/Employee.hbm.xml");
		sessionFactory = config.buildSessionFactory();
	}
	public void testSaveOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee ev = new Employee();
		ev.setId("555");
		ev.setOffice("CZECH");
		ev.setSalary(3600);
		ev.setEmp_name("Brad");
		session.saveOrUpdate(ev); // to use this operation set unsaved-value same as id value
		tx.commit();
		session.close();
		printEmployee("555");
	}
	public void testLoadVsGetOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		// Employee ev = ev = (Employee) session.load(Employee.class, "2000"); throws object not found exception
		Employee ev1 = (Employee) session.get(Employee.class, "2000");
		System.out.println("Employee loaded via get :"+ev1);
		tx.commit();
		session.close();
	}
	public void testNormalLoadOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee ev = (Employee) session.load(Employee.class, "111");
		ev.setOffice("USSR");
		tx.commit();
		session.close();
		printEmployee("111");
	}
	public void testDetachedObjects()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee ev = (Employee) session.load(Employee.class, "111");
		ev.setOffice("USSR");
		tx.commit();
		session.close();
		printEmployee("111");
		ev.setOffice("DDR");
		Session sessionNew = sessionFactory.openSession();
		Transaction txNew = sessionNew.beginTransaction();
		sessionNew.saveOrUpdate(ev);
		txNew.commit();
		sessionNew.close();
		printEmployee("111");
	}
	public void testBatchUpdateException()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee ev = new Employee();
		ev.setId("111");
		ev.setEmp_name("Guru");
		ev.setSalary(3000);
		ev.setOffice("DDR");
		session.save(ev);
		tx.commit();
		session.close();
	}
	private void printEmployee(String pk)
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee ev = (Employee) session.load(Employee.class, pk);
		System.out.println("Office :"+ev.getOffice());
		System.out.println("Salary :"+ev.getSalary());
		System.out.println("Name :"+ev.getEmp_name());
		System.out.println("ID :"+ev.getId());
		tx.commit();
		session.close();
	}
}
