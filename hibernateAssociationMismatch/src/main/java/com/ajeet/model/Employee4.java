package com.ajeet.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee4 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "ls")
	private List<Department4> dls= new ArrayList<>();

	@Override
	public String toString() {
		return "Employee4 [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dls=" + dls + "]";
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

	public List<Department4> getDls() {
		return dls;
	}

	public void setDls(List<Department4> dls) {
		this.dls = dls;
	}
	
	
	

}
