package com._103;

import com._101.Student;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;


public class EqualsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(1,"AJeet","Java");
		Student s2= new Student(10,"kdAJeet","Java");
		Student s3= new Student(5,"djAJeet","Java");
		Student s4= new Student(1,"ranAJeet","Java");
		
		System.out.println(s1.equals(s1));
		
		List<Student> arr= new ArrayList<>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		System.out.println(arr);
		Set<Student> arr1= new HashSet<>();
		arr1.add(s1);
		arr1.add(s2);
		arr1.add(s3);
		arr1.add(s4);
		System.out.println(arr1);

	}

}
