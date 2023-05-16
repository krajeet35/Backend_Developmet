package com._203;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InheritanceSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		C c1= new C();
		c1.i=100;
		c1.j=200;

		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("fil2.sr"));
		
		oo.writeObject(c1);
		
		System.out.println("done");
		oo.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
