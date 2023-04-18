package com._203;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("myobj.sr"));
		
		A a=(A)oi.readObject();
		
		a.funA();
		
		String str= (String)oi.readObject();
		System.out.println(str);
		
		int i= (int)oi.readObject();
		System.out.println(i);
		
		oi.close(); 

	}

}
