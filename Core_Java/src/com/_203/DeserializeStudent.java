package com._203;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class DeserializeStudent {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oi= new ObjectInputStream(new FileInputStream("student.sr"));
		
		List<Student> st=(List<Student>)oi.readObject();
		
		st.forEach(s -> System.out.println(s));
//	Add some new student and update the list;
		Student s1= new  Student(25, "Roy", "HTML");
		
		st.add(s1);
		
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("student.sr"));
		oo.writeObject(st);
		
		System.out.println("done");
		
ObjectInputStream oi1= new ObjectInputStream(new FileInputStream("student.sr"));
		
		List<Student> st1=(List<Student>)oi1.readObject();
		
		st1.forEach(s -> System.out.println(s));
		
		
		
		
		
		oi.close();
		
		
		
		
		
	}
	
	

}
