package com.ajeet.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajeet.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
