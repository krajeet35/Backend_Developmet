package com.ajeet.models;

import javax.persistence.Entity;

@Entity
public class SalaryEmployee extends Employee {
	
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
