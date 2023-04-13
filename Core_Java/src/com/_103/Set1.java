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
	}

}
