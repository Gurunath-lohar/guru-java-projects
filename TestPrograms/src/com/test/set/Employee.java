package com.test.set;

public class Employee implements Comparable{
	String name;
	int id;
		
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
			return ((Employee)o).getName().equals(name);
		return false;
	}
	
	public int hashCode()
	{
		return name.hashCode();
	}
	
	// required for natural order sorting//
	public int compareTo(Object o)
	{
		if(o instanceof Employee)
		{
			Employee e = (Employee)o;
			if(e.getId() > id)
				return -1;
			else if(e.getId() == id)
				return 0;
			else
				return 1;
		}
		return 0;
	}
}
