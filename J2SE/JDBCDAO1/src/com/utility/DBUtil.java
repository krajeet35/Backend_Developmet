package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection provideConnection() {
		Connection conn= null;
		
		String url= "jdbc:mysql://localhost:3306/jdbc1";
		
		try{
			conn= DriverManager.getConnection(url,"root","Ajeet@0340");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return conn;
		
	}

}
