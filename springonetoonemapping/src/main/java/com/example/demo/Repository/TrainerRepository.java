package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

}
