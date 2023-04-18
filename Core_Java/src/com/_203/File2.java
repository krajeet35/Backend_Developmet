package com._203;

import java.io.File;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		
		File f1= new File("abc.txt");
		if(f1.createNewFile()) {
			System.out.println("New file created");
		}
		else {
			System.out.println("File already exist");
		}
		
		
		File f2= new File("d://");
		String[] strings= f2.list();
		for(String s:strings) {
			System.out.println(s);
		}
		
		File[] files= f2.listFiles();
		for(File s:files) {
			System.out.println(s);
		}
//		System.out.println(files);

	}

}
