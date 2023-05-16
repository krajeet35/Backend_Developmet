package com.jdbc101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Select2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the roll: ");
		int roll= sc.nextInt();
		
		
		
		String url="jdbc:mysql://localhost:3306/jdbc1";
		
		try(Connection cn= DriverManager.getConnection(url,"root","Ajeet@0340")){
			
			PreparedStatement ps= cn.prepareStatement("select * from student where roll=?");
			ps.setInt(1, roll);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				int roll1= rs.getInt("roll");
				String name= rs.getString("name");
				int marks= rs.getInt("marks");
				System.out.println(roll+" "+name+" "+marks);
			}
			else {
				System.out.println("no data");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
