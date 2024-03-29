package com.ajeet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.entities.Student;
import com.ajeet.entities.StudentDTO;
import com.ajeet.exceptions.StudentException;
import com.ajeet.service.StudentDaoImpl;
import com.ajeet.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService sService;
	
	@PostMapping("/save")
	public ResponseEntity<String> addStudent(@Valid @RequestBody Student s) throws MethodArgumentNotValidException {
		String res=sService.registerStudent(s);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	
	@GetMapping("/findByRoll/{roll}")
	public ResponseEntity<Student> findStudentByRoll(@PathVariable("roll") Integer roll) throws StudentException{
		Student s= sService.getStudentByRoll(roll);
		return new ResponseEntity<Student>(s, HttpStatus.FOUND);
	}
	@GetMapping("/allStudent")
	public ResponseEntity<List<Student>> getAllStudent() throws StudentException{
		List<Student> ls= sService.getAllStudent();
		
		return new ResponseEntity<List<Student>>(ls, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteByRoll/{roll}")
	public ResponseEntity<String> deleteStudentByRoll(@PathVariable("roll") Integer roll) throws StudentException{
		String s= sService.deleteByRoll(roll);
		return new ResponseEntity<String>(s, HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudentDetails(@Valid @RequestBody Student s) throws StudentException{
		Student s1= sService.updateStudentDetails(s);
		
		return new ResponseEntity<Student>(s1, HttpStatus.OK);
	}
	
	@PutMapping("/updateMarks/{roll}/{marks}")
	public ResponseEntity<Student> updateStudentMarks(@PathVariable("roll") Integer roll, @PathVariable("marks") Integer marks) throws StudentException{
		Student s= sService.updateStudentMarks(roll, marks);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentByMarks/{marks}")
	public ResponseEntity<List<Student>> getStudentByMarksHandler(@PathVariable("marks") Integer marks) throws StudentException{
		List<Student> ls= sService.getStudentByMarks(marks);
		
		return new ResponseEntity<List<Student>>(ls, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentName/{roll}")
	public ResponseEntity<String> getStudentNameHandler(@PathVariable("roll") Integer roll) throws StudentException{
		String n= sService.getStudentNameByRoll(roll);
		return new ResponseEntity<String>(n, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentNameAndRoll/{marks}")
	public ResponseEntity<List<String>> getStudentNameAndRollHandler(@PathVariable("marks") Integer marks) throws StudentException{
		List<String> ls= sService.getNameAndRollByMarks(marks);
		
		return new ResponseEntity<List<String>>(ls, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentNameAndMarks/{marks}")
	public ResponseEntity<List<StudentDTO>> getStudentNameAndMarksHandler(@PathVariable("marks") Integer marks) throws StudentException{
		List<StudentDTO> ls= sService.getNameAndMarksByMarks(marks);
		
		return new ResponseEntity<List<StudentDTO>>(ls, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

} 
