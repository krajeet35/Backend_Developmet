package com.ajeet.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Employee6 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="did")
	private Department6 dept;
	
	@Override
	public String toString() {
		return "Employee5 [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept="+dept+ "]";
	}
	public Department6 getDept() {
		return dept;
	}
	public void setDept(Department6 dept) {
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
	
	
	

}
