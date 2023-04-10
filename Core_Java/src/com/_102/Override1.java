package com._102;

public class Override1 extends Demo {
	
	@Override
	void details() {
//		super.details();
		System.out.println("inside oveeride class");
	}
	
	void name() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		Override1 o1 = new Override1();
		o1.details();
		o1.name();
		o1.roll();
		Demo d1= new Override1();
		d1.details();
		d1.roll();
//		d1.name();
		
		Override1 d2=(Override1)o1;
		d2.details();
		d2.roll();
		d2.name();;

	}

}

class Demo{
	void details() {
		
		System.out.println("Inside demo class");
	}
	
	void roll() {
		System.out.println("roll inside demo");
	}
}


