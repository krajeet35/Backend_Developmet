package com.ajeet.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptid;
	private String dname;
	private String location;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="dept_emp", joinColumns = @JoinColumn(name="did"), inverseJoinColumns = @JoinColumn(name="eid"))
	private List<Employee> ls= new ArrayList<>();
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", location=" + location + ", ls=" + ls + "]";
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Employee> getLs() {
		return ls;
	}
	public void setLs(List<Employee> ls) {
		this.ls = ls;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String dname, String location) {
		super();
		this.dname = dname;
		this.location = location;
	}
	
	

}
