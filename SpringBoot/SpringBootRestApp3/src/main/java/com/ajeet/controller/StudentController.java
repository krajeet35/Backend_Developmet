package com.ajeet.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.model.Address;
import com.ajeet.model.Student;

@Controller
@RestController
@RequestMapping("/student")
public class StudentController {
	
	private List<Student> sList= new ArrayList<>();
	@GetMapping("/reg")
	public void register() {
		sList.add(new Student(20, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060")));
		sList.add(new Student(100, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060")));
		sList.add(new Student(50, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060")));
		sList.add(new Student(60, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060")));
		sList.add(new Student(40, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060")));
		sList.add(new Student(70, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060")));
		sList.add(new Student(10, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060")));
		
	}
	
//	PathVariable
	@RequestMapping("/get/{roll}")
	public ResponseEntity<Student> get(@PathVariable("roll") Integer roll) {
		
		Student s= new Student(20, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		HttpHeaders hh= new HttpHeaders();
		hh.add("user", "admin");
		return new ResponseEntity<Student>(s,hh, HttpStatus.ACCEPTED);
	}
	@RequestMapping("/get2/{roll}/{name}")
	public Student get2(@PathVariable("roll") Integer roll, @PathVariable("name") String name) {
		
		Student s= new Student(20, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		sList.add(s);
		return s;
	}
	
// Request parameter
	@GetMapping("/get3")
	public Student get3(@RequestParam(value="roll", required=false) Integer roll) {
		
		Student s= new Student(25, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		sList.add(s);
		return s;
	}
	
	@GetMapping("/get4")
	public Student get4(@RequestParam("roll") Integer roll, @RequestParam("name") String name) {
		
		Student s= new Student(35, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		sList.add(s);
		return s;
	}
	
//	request parameter with path variable
//	http://localhost:8808/student/get5/name=Aj?10
	@GetMapping("/get5/{name}")
	public Student get5( @PathVariable("name") String name,@RequestParam(value="roll", required=false) Integer roll) {
		
		Student s= new Student(45, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		sList.add(s);
		return s;
	}
	
//	Sending data from request body
	
//	Sending POST request from client
	
//	http://localhost:8808/student/save
//	@PostMapping(value="save", consumes=MediaType.APPLICATION_JSON_VALUE)
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student s) {
//		Save that student obj sent by the client inside the databse
		String result= "Student saved";
		
		
		
		return s.toString()+" "+result;
	}
	
//	update student marks
	@PutMapping("/update/{m}")
	public Student update(@RequestBody Student s, @PathVariable("m") Integer m) {
		s.setMarks(s.getMarks()+m);
		return s;
		
	}
//	http://localhost:8808/student/update/100
	@GetMapping("/getAll")
	public List<Student> getAll(){
		
		return sList;
	}
	@GetMapping("/getByRoll/{roll}")
	public Student getStudentByRoll(@PathVariable("roll") Integer roll) {
	List<Student> newLs=	sList.stream().filter(s -> s.getRoll()==roll).collect(Collectors.toList());
		if(newLs.size()==0) {
			throw new IllegalArgumentException("Student does not exist...");
		}
		
		return newLs.get(0);
		
	}
	@PostMapping("add")
	public List<Student> addStudent(@RequestBody Student s){
		sList.add(s);
		
		return sList;
	}
	@PutMapping("/update2/{roll}")
	public Student update2(@RequestBody Student s, @PathVariable("roll") Integer roll) {
		List<Student> newList= sList.stream().filter(s1 -> s1.getRoll()==roll).collect(Collectors.toList());
		if(newList.size()==0) {
			throw new IllegalArgumentException("Student not exist");
		}
		else {
			newList.get(0).setRoll(s.getRoll());
			newList.get(0).setName(s.getName());
			newList.get(0).setMarks(s.getMarks());
		}
		
		return newList.get(0);
	}
	@DeleteMapping("/delete/{roll}")
	public String delete(@PathVariable("roll") Integer roll) {
		boolean flag= sList.removeIf(s -> s.getRoll()==roll);
		
		if(flag) {
			return ("student removed successfully..");
		}
		else {
			throw new IllegalArgumentException("Student does not exist..");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
