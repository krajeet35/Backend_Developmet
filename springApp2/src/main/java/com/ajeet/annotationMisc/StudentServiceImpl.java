package com.ajeet.annotationMisc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;

	@Override
	public String saveStudent(Student student) {
		dao.insertStudent(student);
		return "Saved";
	}

	@Override
	public List<Student> getAllStudent() {
		return dao.getAll();
	}

}
