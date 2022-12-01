package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Learner;
import com.example.demo.entity.Trainer;
import com.example.demo.service.LearnerService;
import com.example.demo.service.TrainerService;

@RestController
public class LearnerController {
	 @Autowired //setter method
	    private LearnerService learnerService;

	 @Autowired //setter method
	    private TrainerService trainerService;
	 
	 @GetMapping("/learnerlist")
	    public List<Learner> getLearners(){
	    	return this.learnerService.getAllLearner();
	    }
	 @PostMapping("/addlearner")
	 public String addLearner(@RequestBody Learner l ,@RequestParam ("tid")int tid)
	 {
		 Trainer trainer =this.trainerService.searchById(tid);
		 l.setTrainer(trainer);
		  this.learnerService.addLearner(l);
		  return "Learner added Succesfully";
	 }
	 @DeleteMapping("/dellearner/{lid}")
	 public String dellearner(@PathVariable int lid )
	 {
		 this.learnerService.deleteLearner(lid);
		  return "Learner deleted Succesfully";
	 }
}
