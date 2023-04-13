package com._103;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicate {
	
	
	public String removeDuplicate(String str) {
		char[] chr= str.toCharArray();
		Set<Character> l1= new LinkedHashSet<>();
		
		for(char c:chr) {
			l1.add(c);
		}
		StringBuilder sb= new StringBuilder("");
		for(char c:l1) {
			sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDuplicate s= new StringDuplicate();
		String str= s.removeDuplicate("Aajeet");
		System.out.println(str);
				

	}

}
