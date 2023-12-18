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

import com.example.demo.model.Instructor;
import com.example.demo.service.InstructorService;
@RestController
@RequestMapping(path = "api/v1/instructor")
public class InstructorController {
	@GetMapping
	String getBonjour(){
		return "Bonjour Instructor";
	}
	
	private final InstructorService instructorService;
	
	@Autowired
	public InstructorController(InstructorService instructorService) {
		this.instructorService = instructorService;
		}
	
	@GetMapping(value ="all" )
	public List<Instructor> getInstructors()
	{
	return instructorService.getInstructors();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Instructor addInstructor(@RequestBody Instructor instructor){
		instructor = instructorService.addInstructor(instructor);
		return instructor;
	}
	
	@GetMapping(value="{id1}")
	public Instructor getInstructorById(@PathVariable Long id1){
		Instructor instructor;
		instructor = instructorService.getInstructorById(id1);
		return instructor;
	}
	
	@GetMapping(value="/specialite/{specialite}")
	public List<Instructor> getInstructorBySpecialite(@PathVariable String specialite){
		List<Instructor> listInstructor;
		listInstructor = instructorService.getInstructorBySpecialite(specialite);
		return listInstructor;
	}
	
	@DeleteMapping(value="/id/{id1}")
	public void deleteInstructorByid(@PathVariable Long id1){
		instructorService.deleteInstructorByid(id1);
	}
	
	@PutMapping(value="{id1}")
	public void UpdateInstructor(@RequestBody Instructor instructor1, @PathVariable Long id1){
		Instructor instructor;
		instructor = instructorService.getInstructorById(id1);
		if(instructor1!=null)
		{
			instructor.setnom(instructor1.getnom());
			instructor.setEmail(instructor1.getEmail());
			instructor.setPrenom(instructor1.getPrenom());
			instructor.setspecialite(instructor1.getspecialite());
			instructorService.addInstructor(instructor1);
		}
	}

}
