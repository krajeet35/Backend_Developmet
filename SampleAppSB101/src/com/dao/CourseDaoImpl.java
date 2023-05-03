package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.CourseException;
import com.exceptions.Student_CourseException;
import com.model.Course;
import com.model.Student;
import com.model.Student_Course;
import com.utility.DBUtil;

public class CourseDaoImpl implements CourseDao {

	@Override
	public String registerCourse(Course course) throws CourseException {
		String result="Course not registered..";
		
		try(Connection conn= DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into course(cname,fee,duration) values(?,?,?)");
			ps.setString(1, course.getCname());
			ps.setInt(2, course.getFee());
			ps.setString(3, course.getDuration());
			
			int x= ps.executeUpdate();
			if(x>0) {
				result="Course registered successfully....";
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new CourseException(e.getMessage());
		}
		
		
		return result;
	}

	@Override
	public List<Student_Course> getAllStudentsByCourseName(String cname) throws Student_CourseException {
		List<Student_Course> ls = new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()){
			PreparedStatement ps2 = conn.prepareStatement("select * from course where cname=?");
			ps2.setString(1, cname);
			ResultSet rs2= ps2.executeQuery();
			if(rs2.next()) {
				PreparedStatement ps = conn.prepareStatement("select s.roll,s.name,s.email,c.cname,c.duration,c.fee from student as s inner join course as c inner join student_course as sc on s.roll=sc.roll and c.cid=sc.cid and c.cname=?");
				ps.setString(1, cname);
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					Student_Course sc= new Student_Course();
					sc.setRoll(rs.getInt("roll"));
					sc.setName(rs.getString("name"));
					sc.setEmail(rs.getString("email"));
					sc.setCname(rs.getString("cname"));
					sc.setDuration(rs.getString("duration"));
					sc.setFee(rs.getInt("fee"));
				     ls.add(sc);	
				}
				if(ls.size()==0) {
					throw new Student_CourseException("No Student are enrolled..");
				}
			}
			else {
				throw new Student_CourseException("Course Not found...");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new Student_CourseException(e.getMessage());
		}
		
		
		
		return ls;
	}

	

}
