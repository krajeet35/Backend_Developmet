package com.ajeet.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Min;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
//	@Min(value=3, message="{name.invalid}")
	private String cname;
	private Integer fee;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private List<Student> students= new ArrayList<>();
	
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

//	@Override
//	public String toString() {
//		return "Course [cid=" + cid + ", cname=" + cname + ", fee=" + fee + ", students=" + students + "]";
//	}

}
