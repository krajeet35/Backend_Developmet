package com.ajeet.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue(value = "sEmp")
//@PrimaryKeyJoinColumn(name="eid")
public class SalaryEmployee extends Employee3 {
	
	private int salary;

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
