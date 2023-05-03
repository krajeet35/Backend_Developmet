package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exceptions.CourseException;
import com.exceptions.StudentException;
import com.model.Student;
import com.utility.DBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registerStudent(Student student) throws StudentException {
		String result= "Not inserted...";
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into student(name, email, password) values(?,?,?)");
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getPassword());
			
			int x= ps.executeUpdate();
			if(x>0) {
				result="Student registered successfully";
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new StudentException(e.getMessage());
		}
		
		return result;
	}

	@Override
	public Student signInStudent(String username, String password) throws StudentException {
		Student student=null;
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from student where email=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				String e= rs.getString("email");
				String p= rs.getString("password");
				
				student= new Student(r, n, e, p);
			}
			else {
				throw new StudentException("Invalid username or password");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new StudentException(e.getMessage());
		}
		
		return student;
	}

	@Override
	public String enrollStudentInCourse(int roll, int cid) throws StudentException, CourseException {
		String result="Student not enrolled...";
		
		try(Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps1= conn.prepareStatement("select * from student where roll=?");
			ps1.setInt(1, roll);
			ResultSet rs= ps1.executeQuery();
			if(rs.next()) {
				PreparedStatement ps2= conn.prepareStatement("select * from course where cid=?");
				ps2.setInt(1, cid);
				
				ResultSet rs2= ps2.executeQuery();
				if(rs2.next()) {
					PreparedStatement ps3= conn.prepareStatement("insert into student_course values(?,?)");
					ps3.setInt(2, roll);
					ps3.setInt(1, cid);
					
					int x= ps3.executeUpdate();
					
					if(x>0) {
						result="Student enrolled successfully...";
					}
					
				}
				else {
					throw new CourseException("Course not found");
				}
			}
			else {
				throw new StudentException("Student not found ");
			}
			
			
			
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new StudentException(e.getMessage());
			
		}
		
		return result;
	}

}
