package com._203;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InheritanceDeserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream oi= new ObjectInputStream(new FileInputStream("fil2.sr"));
		
		C c1= (C)oi.readObject();
		
		System.out.println(c1.i);
		System.out.println(c1.j);
		oi.close();

	}

}
