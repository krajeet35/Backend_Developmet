package com._203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File5 {

	public static void main(String[] args) throws IOException {
		
//		FileWriter fw= new FileWriter("abc.txt");
//		
//		BufferedWriter bw= new BufferedWriter(fw);
//		char[] ch= {'d','r','g','e'};
//		bw.write(98);
//		bw.newLine();
//		bw.write("Ajeet");
//		bw.newLine();
//		bw.write(ch);
//		bw.newLine();
//		
//		bw.flush();
//		bw.close();
		
//		BufferedReader
		FileReader fr= new FileReader("abc.txt");
		BufferedReader br= new BufferedReader(fr);
		
//		String res1=br.readLine();
//		while(res1!=null) {
//			System.out.println(res1);
//			res1=br.readLine();
//		}
		
//		functional programming
		br.lines().forEach(l -> System.out.println(l));
		

	}

}
