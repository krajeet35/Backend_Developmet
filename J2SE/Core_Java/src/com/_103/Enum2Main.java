package com._103;

import java.util.Scanner;

public class Enum2Main {
	
	public static void printCity(Enum2 e) {
		if(e!=null) {
			e.message();
		}
		else {
			System.out.println("Invalid city");
		}
	}

	public static void main(String[] args) {
//		printCity(Enum2.CHENNAI);
//		printCity(Enum2.DELHI);
//		printCity(null);
		
//		User Input
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter city name");
		String city= sc.next();
		Enum2 e2= Enum2.valueOf(city.toUpperCase());
		
		
			printCity(e2);
		
	}

}
