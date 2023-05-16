package com._204;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Nio2 {

	public static void main(String[] args) throws IOException {
		Path p= Paths.get("file3.txt");
		
		String str= "Welcome Ajeet Roy";
		List<String> l1= Arrays.asList("Bangalore","Delhi","Pune","Patna");
		
		Files.write(p, str.getBytes());
		
//		It will replace old data
//		Files.write(p, l1);
	
//		Append new data
		Files.write(p, l1, StandardOpenOption.APPEND);
		
		
		
		
		
		
		
		
	
		
		System.out.println("done..");

	}

}
