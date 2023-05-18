package com.ajeet.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ajeet.entities.Student;
import com.ajeet.entities.StudentDTO;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
	
	public List<Student> findByMarks(int marks);
	
//	named parameter
	@Query("select s.name from Student s where s.roll=:roll")
	public String getStudentNameByRoll(@Param("roll") Integer roll);
	
//	positional parameter
	@Query("select s.marks from Student s where s.roll=?1")
	public String getStudentMarksByRoll(Integer roll);
	
	
	@Query("select s.name, s.roll from Student s where s.marks=?1")
	public List<String> getNameAndRollByMarks(Integer marks);
	
	@Query("select new com.ajeet.entities.StudentDTO(s.name, s.marks) from Student s where s.marks=?1")
	public List<StudentDTO> getNameAndMarksByMarks(Integer marks);


}
