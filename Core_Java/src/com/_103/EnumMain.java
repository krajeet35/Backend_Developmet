package com._103;

public class EnumMain {

	public static void main(String[] args) {
		Month m=Month.JAN;
		System.out.println(m);
		
		Month[] arr = Month.values();
		
		for(Month n:arr) {
			System.out.println(n+" ordinal: "+ n.ordinal());
			
		}
	}

}
