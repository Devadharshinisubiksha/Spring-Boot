package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public List<Student>getAllStudents(){
		return repository.findAll();
	}
	public Student addStudent(Student s)
	{
		return repository.save(s);
	}
	public void deleteStudent(int sid) {
		repository.deleteById(sid);			
		}
	public Optional<Student>getStudent(int sid){
		return repository.findById(sid);
	}
	public Student updateStudent(int sid, Student s) {
		s.setSid(sid);
		return repository.save(s);
		
	}
	public List<Student> searchByname(String sname) {
		// TODO Auto-generated method stub
		return repository.searchByName(sname);
	}
	
	
}