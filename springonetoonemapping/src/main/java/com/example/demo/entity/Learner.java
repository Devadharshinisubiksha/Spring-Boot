package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Learner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String lname;
	@OneToOne
	@JoinColumn(name="tid")
	private Trainer trainer;
	
	

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Learner(int lid, String lname, Trainer trainer) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.trainer = trainer;
	}
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
