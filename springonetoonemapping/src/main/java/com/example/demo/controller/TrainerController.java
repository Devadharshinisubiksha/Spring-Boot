package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Trainer;

import com.example.demo.service.TrainerService;

@RestController
public class TrainerController {
	@Autowired
	private TrainerService trainerService;
	 @GetMapping("/trainerlist")
	 public List<Trainer> getTrainers(){
		 return this.trainerService.getAllTrainer();
	 }
	 @PostMapping("/addtrainer")
	 public Trainer addTrainer (@RequestBody Trainer t)
	 {
		 return this.trainerService.addTrainer(t);
	 }
	 @DeleteMapping("/deltrainer/{tid}")
	 public String dellearner(@PathVariable int tid )
	 {
		 this.trainerService.deleteTrainer(tid);
		 return "Trainer has been deleted";
	 }
}
