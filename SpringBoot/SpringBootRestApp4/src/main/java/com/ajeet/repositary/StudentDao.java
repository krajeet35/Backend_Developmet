package com.ajeet.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ajeet.entities.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {


}
