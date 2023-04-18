package com._204;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio1 {

	public static void main(String[] args) throws IOException {
		
		Path p= Paths.get("D:\\Learning\\Backend_Developmet\\Core_Java\\file3.txt");
		if(Files.exists(p)) {
			System.out.println("File already exist...");
		}
		else {
			Path p2= Files.createFile(p);
			System.out.println("File created: "+p);
		}
		

	}

}
