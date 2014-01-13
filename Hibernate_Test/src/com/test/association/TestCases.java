package com.test.association;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.hibernate.Query;
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
		config.addResource("com/test/association/Item.hbm.xml");
		config.addResource("com/test/association/Bid.hbm.xml");
		sessionFactory = config.buildSessionFactory();
	}
	public void testLazyLoadOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Item item = (Item) session.load(Item.class, 1111);
		printItem(item);//for lazy load, the print item need to be called when session is active 
		tx.commit();
		session.close();		
	}
	public void testOuterJoinOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Item i left join fetch i.bids where i.id=2222");
		List list = query.list();
		Item item = (Item) list.get(0);		 
		tx.commit();
		session.close();
		printItem(item);//for outer join all objects in one go, print item can be called after session is closed
	}
	public void testNormalOuterJoinOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Item i join i.bids where i.id=2222");
		List list = query.list();
		Object[] objectArray = (Object []) list.get(0);	
		Item item = (Item)objectArray[0];
		Set bids = new HashSet();
		bids.add(objectArray[1]);
		item.setBids(bids);
		tx.commit();
		session.close();
		printItem(item);//for outer join all objects in one go, print item can be called after session is closed
	}
	public void testSelectNormalOuterJoinOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("select i from Item i join i.bids where i.id=2222");
		List list = query.list();
		Item item = (Item) list.get(0);	// selects only items but not bidsin one query
		tx.commit();
		session.close();
		printItem(item);//for outer join all objects in one go, print item can be called after session is closed
	}
	public void testImplicitJoinOperation()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Bid bid where bid.item.item_name='laptop'");
		List list = query.list();
		Bid bid = (Bid)list.get(0);
		Item item = bid.getItem();
		tx.commit();
		session.close();
		printBid(bid);//for outer join all objects in one go, print item can be called after session is closed
	}
	private void printItem(Item item)
	{
		System.out.println("Item Id :"+item.getId());
		System.out.println("Item name :"+item.getItem_name());
		System.out.println("Description :"+item.getDescription());
		System.out.println("Initial price :"+item.getInitial_price());
		Set<Bid> bids = item.getBids();
		for(Bid b : bids)
		{
			printBid(b);
		}
	}
	
	private void printBid(Bid bid)
	{
		System.out.println("Bid Id :"+bid.getId());
		System.out.println("Item Id :"+bid.getItem_id());
		System.out.println("Bid value :"+bid.getBid_value());
		System.out.println("Item name :"+bid.getItem().getItem_name());
	}
}
