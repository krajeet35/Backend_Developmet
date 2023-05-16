package com.usecases;

import java.util.Scanner;

import com.dao.CourseDao;
import com.dao.CourseDaoImpl;
import com.exceptions.CourseException;
import com.model.Course;

public class RegisterCourse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter course name: ");
		String name= sc.next();
		
		System.out.println("enter course fee: ");
		int fee= sc.nextInt();
		
		System.out.println("enter course duration: ");
		String dur= sc.next();
		Course course= new Course();
		course.setCname(name);
		course.setFee(fee);
		course.setDuration(dur);
		
		CourseDao cd= new CourseDaoImpl();
		try {
			String result=cd.registerCourse(course);
			System.out.println(result);
		}
		catch(CourseException e) {
			System.out.println(e.getMessage());
		}

	}

}
