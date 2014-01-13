package com.test.set;

import java.util.Comparator;

public class EmployeeComparator implements Comparator{
	public int compare(Object o, Object o1)
	{
		if(o instanceof Employee && o1 instanceof Employee)
		{
			Employee e1 = (Employee)o;
			Employee e2 = (Employee)o1;
			if(e1.getId() > e2.getId())
				return 1;
			else if(e1.getId() == e2.getId())
				return 0;
			else
				return -1;
		}
		return 0;
	}

}
