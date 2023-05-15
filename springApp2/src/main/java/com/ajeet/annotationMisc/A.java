package com.ajeet.annotationMisc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
	List<String> city;
	
	@Autowired
	Student s1;
	/*
	@Value("${id}")
	private int roll;
	@Value("${name}")
	private String name;
	@Value("${salary}")
	private int salary;
	*/
	@Autowired
	private Environment env;
	
	public void showA() {
		System.out.println("inside showA of A");
//		System.out.println("roll: "+roll+" name: "+name+" salary: "+salary);
		
		System.out.println("roll: "+env.getProperty("roll"));
		System.out.println("name: "+env.getProperty("name"));
		System.out.println("salary: "+env.getProperty("salary"));
		
		System.out.println(city);
		System.out.println(s1);
	}
	
	

}
