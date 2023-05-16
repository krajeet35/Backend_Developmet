package com.coupling;

public class Main {

	public static void main(String[] args) {
		Travel tr= new Travel(new Car());
		Travel tr1= new Travel(new Bike());
		tr.journey();
		tr1.journey();
		

	}

}
