package com._203;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		A a= new A();
		a.i=50;
		
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("myobj.sr"));
		
		oo.writeObject(a);
		oo.writeObject("Ajeet kumar");
		oo.writeObject(100);
		
		System.out.println("done");
		oo.close();

	}

}
