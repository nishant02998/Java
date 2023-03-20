package com.cybage.learnCrudApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.learnCrudApp.entity.Course;

@Service
public class courseServiceImpl implements courseService {
	
	List<Course> list;
	
	
	public courseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(1,"JAVA","JAVA"));
		list.add(new Course(2,"C++","C++"));
	    list.add(new Course(3,"C","C"));
	}


	@Override
	public List<Course> getAllCourses() {
		return list;
	}

	@Override
	public Course getCourse(long l) {
		Course c = null;
		for(Course course: list) {
			if(course.getId()==l) {
				c = course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course c) {
		list.add(c);
		return c;
	}


	@Override
	public String deleteCourse(long id) {
		for(Course course : list)
		{
			if(course.getId() == id)
			{
				list.remove(course);
				break;
			}
		}
		return "Course with " + id + "is removed";
	}


	@Override
	public Course update(Course course, long parseLong) {
		for(Course x : list)
		{
			if(x.getId()==parseLong)
			{
				list.add(course);
				break;
			}
		}
		return course;
	}



}
