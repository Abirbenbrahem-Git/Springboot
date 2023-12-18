package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {
private final CourseRepository courseRepo;
	
	@Autowired
	public CourseService(CourseRepository courseRepo) {
	super();
	this.courseRepo = courseRepo;
	}
	
	public List<Course> getCourses()
	{
	return courseRepo.findAll();
	}
	
	public List<Course> getCourseBytitre(String titre){
		List<Course> listCourse;
		listCourse = courseRepo.findBytitre(titre);
		return listCourse;
	}
}
