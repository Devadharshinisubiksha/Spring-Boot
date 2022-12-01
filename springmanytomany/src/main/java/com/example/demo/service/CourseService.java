package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;


@Service
@Transactional

public class CourseService {
	@Autowired
	private CourseRepository courseRepository;



	public List<Course> getAllCourses()
	{
		return courseRepository.findAll();
	}
	public Course addcourse(Course l)
	{
		return courseRepository.save(l);
	}
	public List<Course> searchbyFeeLessThan(double fee){
     	return this.courseRepository.findByFeeLessThan(fee);
     }
	public List<Course> searchbyCourseTitle(String name){
     	return this.courseRepository.findByTitle(name);
     }
	

}
