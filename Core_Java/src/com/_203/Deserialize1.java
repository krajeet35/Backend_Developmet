package com._203;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fi = new FileInputStream("myobj.txt");
		
		ObjectInputStream oi = new ObjectInputStream(fi);
		Object obj= oi.readObject();
		A a= (A)obj;
		
		a.funA();
		
		oi.close();

	}

}
