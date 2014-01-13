package com.test.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactiory(String className){
		if(sessionFactory != null)
		{
			return sessionFactory;
		}
		try{
			sessionFactory = new AnnotationConfiguration().configure().
			addAnnotatedClass(Class.forName(className)).
			buildSessionFactory();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		return sessionFactory;
	}
}
