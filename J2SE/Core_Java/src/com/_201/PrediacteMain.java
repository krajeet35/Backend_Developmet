package com._201;

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class PrediacteMain {

	public static void main(String[] args) {
		Predicate<Integer> p1= new Predicate1();
		Boolean result=p1.test(0);
		System.out.println(result);
		
//		Using Lambda 
		Predicate<Integer> p2= i ->  i>0;
		
		System.out.println(p2.test(100));
		
		Predicate<Student> p3= s -> s.getMarks()<500;
		
		Boolean res2=p3.test(new Student(1, "AJ", 400));
		System.out.println(res2);
//		
		List<Student> s= new ArrayList<>();
		s.add(new Student(1, "kjhfdg", 500));
		s.add(new Student(10, "kjhdfg", 200));
		s.add(new Student(11, "kjhdfg", 800));
		s.add(new Student(15, "kjdfgh", 300));
		s.add(new Student(18, "kjhfgf", 400));
		s.add(new Student(20, "kkjjh", 700));
		
		
		s.removeIf(p3);
		System.out.println(s);

	}

}
