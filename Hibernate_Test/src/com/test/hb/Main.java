package com.test.hb;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.CreateKeySecondPass;

public class Main {
	
	public static void main(String [] args)
	{
		TestCases testCases = new TestCases();
		testCases.testLoadVsGetOperation();
		//testCases.testSaveOperation();
		//testCases.testNormalLoadOperation();
		//testCases.testDetachedObjects();
		//testCases.testBatchUpdateException();
	}
}
