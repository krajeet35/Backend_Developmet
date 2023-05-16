package com.usecases;

import java.util.List;
import java.util.Scanner;

import com.dao.CourseDao;
import com.dao.CourseDaoImpl;
import com.exceptions.CourseException;
import com.exceptions.Student_CourseException;
import com.model.Student_Course;

public class GetAllStudentByCourseName {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter course name: ");
		String cname= sc.next();
		
		CourseDao cd= new CourseDaoImpl();
		
		try {
			List<Student_Course> ls= cd.getAllStudentsByCourseName(cname);
			
			ls.forEach(s -> System.out.println(s));
		}
		catch(Student_CourseException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
