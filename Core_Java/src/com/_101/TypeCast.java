package com._101;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		byte y= (byte)x;
		float z=x;
		float a= 5.22f;
		double b=10.54;
		float c= (float)b;
		int d= (int) c;
		
		System.out.println(x+" "+y+" "+z+" "+a+" "+b+" "+c+" "+d);
		
		int sum= (int)(y+c);
		System.out.println(sum);
		
		char i=100;
		byte b1= (byte) i;
		byte b2='b';
		System.out.println("i: "+i+" b1: "+ b1+" b2: "+b2);
		

	}

}
