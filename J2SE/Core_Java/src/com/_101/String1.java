package com._101;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("Welcome");
		String s3 = new String("Welcome");
		String s2= "Welcome";
		String s4="Welcome";
		System.out.println(s1+" "+s2);
//		System.out.println(null);
//		Unresolved compilation problem
		
		
		System.out.println(s2==s1);
		System.out.println(s2.equals(s1));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s4));
		System.out.println(s4.contains("comy"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello welcome");
		sb.append(" Roy");
		System.out.println(sb);
	}

}
