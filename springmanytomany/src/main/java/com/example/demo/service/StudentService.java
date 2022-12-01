package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;



	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}
	public Student addstudent(Student l)
	{
		return studentRepository.save(l);
	}
	 public List<Student> searchbyname(String name){
     	return this.studentRepository.findByNameContaining(name);
     }


}
