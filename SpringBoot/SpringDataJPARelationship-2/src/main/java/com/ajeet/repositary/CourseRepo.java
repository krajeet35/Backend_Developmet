package com.ajeet.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ajeet.entities.Course;
import com.ajeet.entities.Student;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	
	public Course findBycname(String cname);
	
	@Query("select c.students from Course c where c.cname=?1")
	public List<Student> getStudentByCname(String cname);
}
