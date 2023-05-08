package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	
	public static void main(String[] args) {
		provideConnection();
	}
	
	public static Connection provideConnection() {
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/sb201";
		
		try {
			conn= DriverManager.getConnection(url,"root","Ajeet@0340");
			System.out.println(conn);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
