package com._103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com._101.Student;

public class List1 {
	
	public static void main(String[] args) {
		
		List<Student> s1 = new ArrayList<>();
		System.out.println(s1);
		s1.add(new Student(1, "aj", "python"));
		System.out.println(s1);
		
		List<Integer> l1= new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			l1.add(i);
			l1.add(null);
		}
		System.out.println(l1);
		
//		Boxing and unboxing
		Integer i1 = Integer.valueOf(10);
		System.out.println(i1);
		int x = i1.intValue();
		System.out.println(x);
//		LinkedList
		
		List<Integer> l2= new LinkedList<>();
		
		int i=0;
		while(i<10) {
			l2.add(i);
//			l2.add(null);
			i++;
		}
		System.out.println(l2);
		for(int j:l2) {
			System.out.println(j);
		}
		
//		Vector Class
		List<Integer> v1= new Vector<>();
		v1.add(10);
		v1.add(null);
		v1.add(5);
		System.out.println(v1);
		
		List<Integer> st1= new Stack<>();
		st1.add(10);
		st1.add(null);
		st1.add(5);
		System.out.println(st1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
