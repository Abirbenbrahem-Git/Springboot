package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	@GetMapping
	String getBonjour(){
		return "Bonjour etudiant";
	}
	
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
		}
	
	@GetMapping(value ="all" )
	public List<Student> getStudents()
	{
	return studentService.getStudents();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student addStudent(@RequestBody Student student){
		student = studentService.addStudent(student);
		
		return student;
	}
	
	@GetMapping(value="{id}")
	public Student getStudentById(@PathVariable Long id){
		Student student;
		student = studentService.getStudentById(id);
		return student;
	}
	
	@GetMapping(value="/niveau/{niveau}")
	public List<Student> getStudentByniveau(@PathVariable String niveau){
		List<Student> listStudent;
		listStudent = studentService.getStudentByniveau(niveau);
		return listStudent;
	}
	
	@DeleteMapping(value="/id/{id}")
	public void deleteStudentByid(@PathVariable Long id){
		studentService.deleteStudentByid(id);
	}
	
	@PutMapping(value="{id}")
	public void UpdateStudent(@RequestBody Student offre, @PathVariable Long id){
		Student student;
		student = studentService.getStudentById(id);
		if(student!=null)
		{
			student.setnom(offre.getnom());
			student.setEmail(offre.getEmail());
			student.setPrenom(offre.getPrenom());
			student.setniveau(offre.getniveau());
			studentService.addStudent(student);
		}
	}

}
