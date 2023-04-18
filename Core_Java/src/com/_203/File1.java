package com._203;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		File f1= new File("abc.text");
		
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		
		File f2= new File("myFile1");
		f2.mkdir();
		
		File f3= new File(f2,"abc.text");
		f3.createNewFile();
	}

}
