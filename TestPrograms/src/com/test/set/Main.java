package com.test.set;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String [] args)
	{
		Employee e1 = new Employee("test",1);
		Employee e2 = new Employee("world",2);
		Employee e3 = new Employee("guru",3);
		Employee e4 = new Employee("sun",4);
		Employee e5 = new Employee("sun",4);
		Set<Employee> s1 = new TreeSet<Employee>(); // for natural order sorting
		//Set<Employee> s1 = new TreeSet<Employee>(new EmployeeComparator()); // for customised sorting
		s1.add(e1);
		s1.add(e3);
		s1.add(e5);
		s1.add(e2);
		System.out.println(s1.add(e4));
		for(Employee e : s1)
			System.out.println(e.getName());
	}
}
