package com._101;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] roll= {1,2,4,6,9,5};
		String[] name = {"Aj","rj","ramesh","Shruti","kajal","Ramsy"};
		String[] course = {"Java","python","c#","JavaScript","SQL","PHP"};
		
		int i=0;
		for(int j=0;j<roll.length;j++) {
			
		
		Student s1 = new Student(roll[i], name[i], course[i++]);
		System.out.println(s1.toString());
		}
	}

}
