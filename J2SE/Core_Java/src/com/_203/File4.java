package com._203;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File4 {

	public static void main(String[] args) throws IOException {
		
		
		File f= new File("abc.txt");
		FileReader fr1= new FileReader(f);
		
//		int res= fr1.read();
//		while(res!=-1) {
//			System.out.print((char)res);
//			res= fr1.read();
//		}
		
		long n= f.length();
		char[] ch= new char[(int)n];
		    
		fr1.read(ch);
		for(char c:ch) {
			System.out.print(c);	
		}
		

	}

}
