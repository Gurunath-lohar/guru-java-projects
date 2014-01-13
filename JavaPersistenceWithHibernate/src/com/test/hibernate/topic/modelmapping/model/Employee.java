package com.test.hibernate.topic.modelmapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	String id;
	String emp_name;
	int salary;
	String office;
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(name="emp_name", nullable=false)
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String empName) {
		emp_name = empName;
	}
	@Column(name="salary", nullable=false)
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Column(name="office", nullable=false)
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
}
