package com._201;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		Function<Student,String> f1= new Function1();
		
		String res=f1.apply(new Student(10,"Chanchal",600));
		System.out.println(res);
		
		Function<Student,String> f2= s -> {
		return	s.getMarks()>=500 ? "Pass" :"Fail";
			
		};
		
		System.out.println(f2.apply(new Student(4,"ro7",100)));
	
	    List<String> l1= new ArrayList<>();
	    
	    System.out.println(l1.stream());
	
	}

}
