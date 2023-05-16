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
public class Department3 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptid;
	private String dname;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dept")
	private List<Employee3> ls= new ArrayList<>();

	@Override
	public String toString() {
		return "Department3 [deptid=" + deptid + ", dname=" + dname + ", location=" + location + ", ls=" + ls + "]";
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

	public List<Employee3> getLs() {
		return ls;
	}

	public void setLs(List<Employee3> ls) {
		this.ls = ls;
	}
	
	

}
