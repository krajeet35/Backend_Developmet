package com._204;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Nio5 {

	public static void main(String[] args) throws IOException {
		Path p= Paths.get("file3.txt");
		
		Path newFile= Paths.get("file4.txt");
		
		Files.createFile(newFile);
		
		List<String> l1= Files.readAllLines(p);
		
		Files.write(newFile, l1);
		
		System.out.println("done....");

	}

}
