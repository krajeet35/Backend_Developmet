package com._103;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Aj");
		set.add(null);
		set.add("roy");
		set.add(null);
		set.add("Aj");
		System.out.println(set);
//		Linked HashSet
		
		Set<String> set2= new LinkedHashSet<>();
		set2.add("Aj");
		set2.add(null);
		set2.add("roy");
		set2.add(null);
		set2.add("Aj");
		System.out.println(set2);
		
//		TreeSet
		Set<String> set3= new TreeSet<>();
		set3.add("Aj");
//		set3.add(null);
		set3.add("roy");
//		set3.add(null);
		set3.add("Aj");
		System.out.println(set3);
		
		Comparator1 cm= new Comparator1();
		Set<Employee> tr1= new TreeSet<>(cm);
		
		tr1.add(new Employee(1, "Abhjbj", "eng",50000));
		tr1.add(new Employee(2, "Ajbjh", "eng",50000));
		tr1.add(new Employee(2, "hjAj", "eng",60000));
		
		System.out.println(tr1);
Set<Employee> tr2= new TreeSet<>();
		
		tr2.add(new Employee(1, "Abhjbj", "eng",50000));
		tr2.add(new Employee(2, "Ajbjh", "eng",50000));
		tr2.add(new Employee(2, "hjAj", "eng",60000));
		
		System.out.println(tr2);
	}

}
