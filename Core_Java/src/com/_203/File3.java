package com._203;

import java.io.FileWriter;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw1= new FileWriter("abc.txt");
		fw1.write(100);
		fw1.write("\n");
		fw1.write("Ajeet\nWelcome");
		fw1.write("\n");
		char[] ch= {'a','f','e'};
		fw1.write(ch);
		
		
		
		
		
		
		
		
		fw1.flush();
		
		fw1.close();

	}

}
