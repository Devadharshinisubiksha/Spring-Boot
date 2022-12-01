package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	
	@Column(name="sname",length=10)
	private String sname;
	private String sdegree;
	private String scity;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdegree() {
		return sdegree;
	}

	public void setSdegree(String sdegree) {
		this.sdegree = sdegree;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public Student(int sid, String sname, String sdegree, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdegree = sdegree;
		this.scity = scity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	