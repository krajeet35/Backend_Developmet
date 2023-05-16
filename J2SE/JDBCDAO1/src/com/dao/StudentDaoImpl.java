package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.StudentException;
import com.model.Student;
import com.utility.DBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String insertStudentDetails(int roll, String name, int marks) {
		String message="Not inserted.....";
		try(Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="Record inserted successfully!";
			}
			
		}
		catch(SQLException e) {
			message= e.getMessage();
		}
		
		return message;
	}

	@Override
	public String insertStudentDetails2(Student student) {
		String message= "Not inserted...";
		
		try(Connection conn= DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getMarks());
			
			int x= ps.executeUpdate();
			if(x>0) {
				message= "Inserted successfully.....";
			}
		}
		catch(SQLException e) {
			message= e.getMessage();
		}
		
		
		
		
		return message;
	}

	@Override
	public int getMarksByRoll(int roll) {
		int marks=-1;
		
		try(Connection conn= DBUtil.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select marks from student where roll=?");
			ps.setInt(1, roll);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				marks=rs.getInt("marks");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();;
		}
		
		return marks;
	}

	@Override
	public Student getStudentByRoll(int roll) {
		Student student=null;
		try(Connection conn= DBUtil.provideConnection()){
			
			
			PreparedStatement ps = conn.prepareStatement("select * from student where roll=?");
			
			ps.setInt(1, roll);
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int r=rs.getInt("roll");
				String n=rs.getString("name");
				int m=rs.getInt("marks");
				
				student = new Student(r, n, m);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> ls=new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from emp");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				int m= rs.getInt("marks");
				Student student= new Student(r, n, m);
				
				ls.add(student);
			}
			
		}
		catch(SQLException e) {
//			e.printStackTrace();
			throw new StudentException(e.getMessage());
		}
		if(ls.size()==0) {
			throw new StudentException("No student found..");
		}
		
		
		
		return ls;
	}

}
