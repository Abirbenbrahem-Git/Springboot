package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentReposirory;

@Service
public class StudentService {
private final StudentReposirory studentRepo;
	
	@Autowired
	public StudentService(StudentReposirory studentRepo) {
	super();
	this.studentRepo = studentRepo;
	}
	
	public List<Student> getStudents()
	{
	return studentRepo.findAll();
	}
	
	public Student addStudent(Student student) {
	     student = studentRepo.save(student);
	    return student;
	}
	
	public Student getStudentById(Long id){
		Student student;
		student = studentRepo.findById(id).get();
		return student;
	}
	
	public List<Student> getStudentByniveau(String niveau){
		List<Student> listStudent;
		listStudent = studentRepo.findByniveau(niveau);
		return listStudent;
	}
	
	public void deleteStudentByid(Long id){
		studentRepo.deleteByid(id);
	}
}
