package com._203;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeStudent {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Student> students= new ArrayList<>();
		
		students.add(new Student(1, "aj", "java"));
		students.add(new Student(10, "aknjj", "javaScript"));
		students.add(new Student(15, "dfaj", "java"));
		students.add(new Student(17, "adfj", "C#"));
		students.add(new Student(5, "fdaj", "java"));
		students.add(new Student(6, "sdfaj", "net"));
		students.add(new Student(9, "dsfaj", "c++"));
		students.add(new Student(8, "dfaj", "python"));
		
		ObjectOutputStream oo= new ObjectOutputStream(new FileOutputStream("student.sr"));
		oo.writeObject(students);
		
		System.out.println("done");
		oo.close();

	}

}
