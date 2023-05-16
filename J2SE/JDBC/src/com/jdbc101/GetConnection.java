package com.jdbc101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static void main(String[] args) {
		
		String url= "jdbc:mysql://localhost:3306/jdbc1";
		
		try(Connection cn= DriverManager.getConnection(url,"root","Ajeet@0340")){
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
