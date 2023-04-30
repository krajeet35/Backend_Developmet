package com.jdbc101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareState {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("enter roll: ");
		int roll= sc.nextInt();
		
		System.out.println("enter name: ");
		String name= sc.next();
		
		System.out.println("enter marks: ");
		int mark= sc.nextInt();
		
		String url= "jdbc:mysql://localhost:3306/jdbc1";
		
		try(Connection cn= DriverManager.getConnection(url,"root","Ajeet@0340")){
			PreparedStatement ps1 = cn.prepareStatement(
					"insert into student values(?,?,?)");
			
			ps1.setInt(1, roll);
			ps1.setString(2, name);
			ps1.setInt(3, mark);
			
			int x=ps1.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
