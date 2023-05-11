package com.ajeet.model;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state", column=@Column(name="H_state")),
		@AttributeOverride(name="city", column=@Column(name="H_city")),
		@AttributeOverride(name="pincode", column=@Column(name="H_pincode")),
	})
	private Address homeA;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state", column=@Column(name="O_state")),
		@AttributeOverride(name="city", column=@Column(name="O_city")),
		@AttributeOverride(name="pincode", column=@Column(name="O_pincode")),
	})
	private Address officeA;

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", name=" + name + ", salary=" + salary + ", homeA=" + homeA + ", officeA="
				+ officeA + "]";
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

	public Address getHomeA() {
		return homeA;
	}

	public void setHomeA(Address homeA) {
		this.homeA = homeA;
	}

	public Address getOfficeA() {
		return officeA;
	}

	public void setOfficeA(Address officeA) {
		this.officeA = officeA;
	}
	
	

}
