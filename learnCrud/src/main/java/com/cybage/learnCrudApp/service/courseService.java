package com.cybage.learnCrudApp.service;

import java.util.List;

import com.cybage.learnCrudApp.entity.Course;


public interface courseService {
	public List<Course> getAllCourses();

	public Course getCourse(long l);

	public Course addCourse(Course c);
	
	public String deleteCourse(long id);

	public Course update(Course course, long parseLong);
}
