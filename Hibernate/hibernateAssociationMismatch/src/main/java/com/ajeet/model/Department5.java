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
import javax.persistence.OneToOne;

@Entity
public class Department5 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptid;
	private String dname;
	private String location;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee5 emp;

	@Override
	public String toString() {
		return "Department5 [deptid=" + deptid + ", dname=" + dname + ", location=" + location + ", emp=" + emp + "]";
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

	public Employee5 getEmp() {
		return emp;
	}

	public void setEmp(Employee5 emp) {
		this.emp = emp;
	}
	
	

}
