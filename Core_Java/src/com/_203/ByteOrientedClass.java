package com._203;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOrientedClass {

	public static void main(String[] args) throws IOException {
		FileInputStream fi= new FileInputStream("E:\\Downloads\\Wallpaper.jfif");
		FileOutputStream fo = new FileOutputStream("E:\\Downloads\\prob3.jpeg");
		
		int i= fi.read();
		while(i !=-1) {
			fo.write(i);
			i=fi.read();
		}
		
		fo.flush();
		fo.close();
		fi.close();
 
	}

}
