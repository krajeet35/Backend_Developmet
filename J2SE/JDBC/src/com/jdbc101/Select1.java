package com.jdbc101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select1 {

	public static void main(String[] args) {
		
		String url= "jdbc:mysql://localhost:3306/jdbc1";
		
		try(Connection cn= DriverManager.getConnection(url,"root","Ajeet@0340")){
			
			PreparedStatement ps1= cn.prepareStatement("select * from student");
			
			ResultSet rs1= ps1.executeQuery();
			while(rs1.next()) {
				int roll=rs1.getInt("roll");
				String name= rs1.getString("name");
				int mark= rs1.getInt("marks");
				
				System.out.println(roll+" "+name+" "+mark);
			}
			 
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
