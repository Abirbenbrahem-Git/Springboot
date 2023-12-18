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

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping(path = "api/v1/course")
public class CourseController {
		@GetMapping
		String getBonjour(){
			return "Bonjour course";
		}
		
		private final CourseService courseService;
		
		@Autowired
		public CourseController(CourseService courseService) {
			this.courseService = courseService;
			}
		
		@GetMapping(value ="all" )
		public List<Course> getCourses()
		{
		return courseService.getCourses();
		}
		
		@GetMapping(value="/titre/{titre}")
		public List<Course> getCourseBytitre(@PathVariable String titre){
			List<Course> listCourse;
			listCourse = courseService.getCourseBytitre(titre);
			return listCourse;
		}
	}
