package com.cybage.learnCrudApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.learnCrudApp.entity.Course;
import com.cybage.learnCrudApp.service.courseService;

@RestController
public class CRUD_Controllers {
	@Autowired
	private courseService service;

	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses(){
		return service.getAllCourses();
	}
	
	@GetMapping("/getCourse/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return service.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return service.addCourse(course);
	}
	
	@DeleteMapping("/deleteCourse/{courseId}")
	public String deleteCourse(@PathVariable String courseId) {
		return service.deleteCourse(Long.parseLong(courseId));
	}
	
	@PutMapping("/update/{courseId}")
	public Course updateCourse(@RequestBody Course course, @PathVariable String courseId) {
		return service.update(course, Long.parseLong(courseId));
	}
}
