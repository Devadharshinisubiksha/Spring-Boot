package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private String tname;
	/*@OneToOne(mappedBy ="trainer")
	private Learner learner;*/
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
/*	public Learner getLearner() {
		return learner;
	}
	public void setLearner(Learner learner) {
		this.learner = learner;
	}*/
	/*public Trainer(int tid, String tname, Learner learner) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.learner = learner;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	
}
