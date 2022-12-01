package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Learner;

public interface LearnerRepository  extends JpaRepository<Learner, Integer>{

}
