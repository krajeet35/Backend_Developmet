package com._102;

public class BankDemo {

	public static void main(String[] args) {
		Bank b1= new SBI();
		Bank b2= new PNB();
		Bank b3= new ICICI();
		System.out.println("Rate of interest of SBI:"+ b1.getRateOfInterest());
		System.out.println("Rate of interest of PNB:"+ b2.getRateOfInterest());
		System.out.println("Rate of interest of ICICI:"+ b3.getRateOfInterest());

	}

}
