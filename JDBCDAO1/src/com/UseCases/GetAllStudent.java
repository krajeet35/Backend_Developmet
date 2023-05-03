package com.UseCases;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.StudentException;
import com.model.Student;

public class GetAllStudent {

	public static void main(String[] args) {
		
		StudentDao sd= new StudentDaoImpl();
		
		try {
		List<Student> ls=sd.getAllStudent();
		ls.forEach( s -> System.out.println(s));
		}
		catch(StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
			
		

	}

}
