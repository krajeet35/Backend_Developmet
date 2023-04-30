package com.jdbc101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GraceMarks {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the grace marks: ");
		
		int grace= sc.nextInt();
		
		String url= "jdbc:mysql://localhost:3306/jdbc1";
		
		try(Connection cn = DriverManager.getConnection(url,"root","Ajeet@0340")){
			PreparedStatement ps= cn.prepareStatement(
					"update student set marks= marks +? where marks<400");
			ps.setInt(1, grace);
			
			int x=ps.executeUpdate();
			System.out.println(x);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
