package com.ajeet.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajeet.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	public Course findBycname(String cname);
}
