package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
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
		return this.service.addStudent(s);
	}
	@DeleteMapping("/delstudent/{id}")
	public String delStudent(@PathVariable int id)
	{
		this.service.deleteStudent(id);
		return "student has been deleted";
	}
	@GetMapping("/student/{sid}")
	public Optional<Student> getStudent(@PathVariable int sid){
		return this.service.getStudent(sid);
	}
	
	@PutMapping ("/student/{sid}")
	public String updateStudent(@PathVariable int sid, @RequestBody Student s) {
		this.service.updateStudent(sid, s);
		return "Student has been updated";
	}
	
	@GetMapping("/search/{sname}")
	public List<Student>searchByname(@PathVariable  String sname){
		return this.service.searchByname(sname);
	}

}
