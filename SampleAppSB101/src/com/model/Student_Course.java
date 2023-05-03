package com.model;

public class Student_Course {
	
	private int roll;
	private String name;
	private String email;
	private String cname;
	private String duration;
	private int fee;
	
	public Student_Course() {
		// TODO Auto-generated constructor stub
	}

	public Student_Course(int roll, String name, String email, String cname, String duration, int fee) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.cname = cname;
		this.duration = duration;
		this.fee = fee;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student_Course [roll=" + roll + ", name=" + name + ", email=" + email + ", cname=" + cname
				+ ", duration=" + duration + ", fee=" + fee + "]";
	}
	

}
