package com.ajeet.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
@Entity
public class Employee2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="deptid")
	private Department2 dept;
	
	
	public Department2 getDept() {
		return dept;
	}
	public void setDept(Department2 dept) {
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee2() {
		// TODO Auto-generated constructor stub
	}
	public Employee2(String name, int salary, Department2 dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
