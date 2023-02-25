package com._101;

public class Demo5 {

	public static void main(String[] args) {
		int x=11;
		if(x%5==0 && x%3==0) {
			System.out.println("Hello Welcome");
		}
		else if(x%3==0) {
			System.out.println("Welcome");
		}
		else if(x%5==0) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Invalid number");
		}

	}

}
