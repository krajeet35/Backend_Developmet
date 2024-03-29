package com.ajeet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.ajeet.entities.Student;
import com.ajeet.entities.StudentDTO;
import com.ajeet.exceptions.StudentException;
import com.ajeet.repositary.StudentDao;

@Service
public class StudentDaoImpl implements StudentService {
	@Autowired
	private StudentDao sd;

	@Override
	public String registerStudent(Student s) {
		String result= "Student not registered...";
		Student s1=sd.save(s);
		result="Student registered successfully..";
		return result;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
		Optional<Student> s= sd.findById(roll);
		
		if(s.isPresent()) {
			return s.get();
		}
		else {
			throw new StudentException("Student not found with roll: "+roll);
		}
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> ls= sd.findAll();
		if(ls.size()==0) {
			throw new StudentException("Student data are not available");
		}
		else {
			return ls;
		}
	}

	@Override
	public String deleteByRoll(Integer roll) throws StudentException {
		String result= "Student not deleted";
		Optional<Student> opt= sd.findById(roll);
		if(opt.isPresent()) {
			Student s= opt.get();
			sd.delete(s);
			result="Student deleted successfully...";
		}
		else {
			throw new StudentException("Student not found with roll: "+roll);
		}
		
		
		return result;
	}

	@Override
	public Student updateStudentDetails(Student s) throws StudentException {
		Optional<Student> opt= sd.findById(s.getRoll());
		
		if(opt.isPresent()) {
			Student s1= sd.save(s);
			return s1; 
		}
		else {
			throw new StudentException("Student not found");
		}
	}

	@Override
	public Student updateStudentMarks(Integer roll, Integer grace) throws StudentException {
		Optional<Student> opt= sd.findById(roll);
		if(opt.isPresent()) {
			Student s= opt.get();
			s.setMarks(s.getMarks()+grace);
			return sd.save(s);
		}
		else {
			throw new StudentException("Student not found with roll: "+roll);
		}
	}

	@Override
	public List<Student> getStudentByMarks(Integer marks) throws StudentException {
		List<Student> ls= sd.findByMarks(marks);
		if(ls.size()==0) {
			throw new StudentException("Student not found");
		}
		else {
			return ls;
		}
	}

	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		String name= sd.getStudentNameByRoll(roll);
		if(name!=null) {
			return name;
		}
		else {
			throw new StudentException("Student not found with roll: "+roll);
		}
	}

	@Override
	public List<String> getNameAndRollByMarks(Integer marks) throws StudentException {
		List<String> ls= sd.getNameAndRollByMarks(marks);
		if(ls.size()==0) {
			throw new StudentException("Student not found");
		}
		else {
			return ls;
		}
	}

	@Override
	public List<StudentDTO> getNameAndMarksByMarks(Integer marks) throws StudentException {
		List<StudentDTO> ls= sd.getNameAndMarksByMarks(marks);
		
		if(ls.size()==0) {
			throw new StudentException("Student not found");
		}
		else {
			return ls;
		}
	}

}
