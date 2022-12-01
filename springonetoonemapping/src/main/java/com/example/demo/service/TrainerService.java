package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TrainerRepository;

import com.example.demo.entity.Trainer;


@Service
@Transactional
public class TrainerService {
@Autowired
private TrainerRepository trainerRepository;
public List<Trainer> getAllTrainer(){
	return trainerRepository.findAll();
	//localhost:8080/trainerlist
}
public Trainer addTrainer(Trainer t)
{
	return trainerRepository.save(t);
	//localhost:8080/addtrainer
}
public Trainer searchById(int tid)
{
	return trainerRepository.findById(tid).get();
}
public void deleteTrainer(int tid) {
	trainerRepository.deleteById(tid);
}
}
