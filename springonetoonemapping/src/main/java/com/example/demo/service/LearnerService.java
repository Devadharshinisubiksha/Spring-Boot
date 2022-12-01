package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LearnerRepository;
import com.example.demo.entity.Learner;



@Service
@Transactional
public class LearnerService {
@Autowired
private LearnerRepository learnerRepository;

public List<Learner> getAllLearner(){
	return learnerRepository.findAll();
	//localhost:8080/learnerlist
}
public Learner addLearner(Learner l)
{
	return learnerRepository.save(l);
	//localhost:8080/addlearner?tid=1
}
public void deleteLearner(int lid) {
	learnerRepository.deleteById(lid);
}
}
