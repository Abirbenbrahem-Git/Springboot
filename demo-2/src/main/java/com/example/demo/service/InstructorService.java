package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Instructor;
import com.example.demo.repository.InstructorRepository;

@Service
public class InstructorService {
private final InstructorRepository instructorRepo;
	
	@Autowired
	public InstructorService(InstructorRepository instructorRepo) {
	super();
	this.instructorRepo = instructorRepo;
	}
	
	public List<Instructor> getInstructors()
	{
	return instructorRepo.findAll();
	}
	
	public Instructor addInstructor(Instructor instructor) {
		instructor = instructorRepo.save(instructor);
	    return instructor;
	}
	
	public Instructor getInstructorById(Long id1){
		Instructor instructor;
		instructor = instructorRepo.findById(id1).get();
		return instructor;
	}
	
	public List<Instructor> getInstructorBySpecialite(String specialite){
		List<Instructor> listInstructor;
		listInstructor = instructorRepo.findBySpecialite(specialite);
		return listInstructor;
	}
	
	public void deleteInstructorByid(Long id1){
		instructorRepo.deleteByid(id1);
	}
}
