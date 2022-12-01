package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	@Autowired
	private CourseService service;
	
	@GetMapping("/courselist")
	public List<Course> getCourse(){
		return this.service.getAllCourses();
	}
	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course s)
	{
		return this.service.addcourse(s);
		
}
	@GetMapping("/search/{price}")
    public List<Course> findCourseLessThanPrice(@PathVariable double price){
        return this.service.searchbyFeeLessThan(price);
    }
	@GetMapping("/find/{title}")
    public List<Course> findStudentsbyTitle(@PathVariable String title){
        return this.service.searchbyCourseTitle(title);
    }

	
	

}
