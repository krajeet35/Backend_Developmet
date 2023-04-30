package com.jdbc101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			Connection cn= DriverManager.getConnection(url, "root", "Ajeet@0340");
			if(cn != null) {
				System.out.println("Connected....");
			}
			else {
				System.out.println("Not connected....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
