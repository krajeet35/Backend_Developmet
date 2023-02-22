package com._101;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println(1/10);
		Demo2 d1 = new Demo2();
		int duration=2;
		double res=d1.interest(10000, 12, duration);
		System.out.println("Interest for "+duration+" year is " +res);

	}
	
	double interest(int amount,int ROI,int duration) {
		double r=(amount*ROI)/100; 
//		System.out.println(100/100);
		double interest= r*duration;
		 return interest;
	 };

}
 
 
 
