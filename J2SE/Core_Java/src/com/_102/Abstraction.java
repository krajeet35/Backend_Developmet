package com._102;

public class Abstraction extends Main {
	@Override
	public void details(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" is implemented");
		
	}
	public static void main(String[] args) {
		Main m1 = new Abstraction();
		m1.funA();
		m1.details("Ajeet");
	}
	

}

abstract class Main{

	
public abstract void details(String name);
	
	void funA() {
		System.out.println("Inside funA of class Abstraction");
	}
	
}
