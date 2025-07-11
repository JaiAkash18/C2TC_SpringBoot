package com.tnsif.CourseModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.CourseModule.entity.Course;
import com.tnsif.CourseModule.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	@PostMapping("/Course")
	public Course createCourse(@RequestBody Course course)
	{
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/course")
	public List<Course> getAllCourses(){
		return courseService.getAllCourse();
	}
}
