package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/studentlist")
	public List<Student> getStudent(){
		return this.service.getAllStudents();
	}
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student s)
	{
		return this.service.addstudent(s);
		
}
	@GetMapping("/find/{name}")
    public List<Student> findStudentsContainingByName(@PathVariable String name){
        return this.service.searchbyname(name);
    }

}
