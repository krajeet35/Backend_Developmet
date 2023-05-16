package com.jdbc101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter roll: ");
		int roll= sc.nextInt();
		
		System.out.println("enter name: ");
		String name= sc.next();
		
		System.out.println("enter marks: ");
		int mark= sc.nextInt();
		
		
		
		
		
		Connection cn=null;
		
//		Loading the driver related main class into 
//		the memory.
		
		try {
			Class .forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Driver could not load");
		}
//		Connection url
		String url= "jdbc:mysql://localhost:3306/jdbc1";
		
//		Getting connection
		try {
			 cn= DriverManager.getConnection(url, "root", "Ajeet@0340");
			
			Statement st=cn.createStatement();
			
			int x= st.executeUpdate("insert into student values("+roll+",'"+name+"',"+mark+")");
			
			ResultSet r1= st.executeQuery("select * from student");
			
//			System.out.println(r1.toString());
			
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
