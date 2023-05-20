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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
//	@Min(value=3, message="{name.invalid}")
	private String cname;
	private Integer fee;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private List<Student> students= new ArrayList<>();
	

}
