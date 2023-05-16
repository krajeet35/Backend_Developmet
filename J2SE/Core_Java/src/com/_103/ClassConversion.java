package com._103;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClassConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1= new ArrayList<>();
		int i=1,j=5;
		while(i<10) {
			l1.add(i);
			l1.add(j);
			i++;
			j++;
		}
		System.out.println(l1);
		
		Set<Integer> s1= new LinkedHashSet<>(l1);
		System.out.println(s1);
		
		l1= new ArrayList<>(s1);
		
		System.out.println(l1);

	}

}
