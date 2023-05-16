package com._101;

public class Array1 {
	
	Array1(int roll, String name){
		System.out.println(roll+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		System.out.println(args[0]);
		
		int[] arr1 = new int[10];
		String[] arr2= new String[10];
		
		for( int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
		}
		Array1[] arr3= {new Array1(1,"aj"), new Array1(3,"ajeet")};
		

	}

}
