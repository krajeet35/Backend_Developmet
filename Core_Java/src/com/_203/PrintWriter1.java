package com._203;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw= new PrintWriter("abc.txt");
		
		pw.write(100);
		pw.println();
		pw.println(200);
		pw.println(true);
		pw.println("Ajeet kumar");
		pw.print('d');
		
		pw.close();
		

	}

}
