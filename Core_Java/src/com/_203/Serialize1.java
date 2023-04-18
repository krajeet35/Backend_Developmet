package com._203;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize1 {

	public static void main(String[] args) throws IOException {
		A a= new A();
		a.i=20;
		
		FileOutputStream fo= new FileOutputStream("myobj.txt");
		ObjectOutputStream oo= new ObjectOutputStream(fo);
		oo.writeObject(a);
		
		
		
		
		System.out.println("done");

	}

}
