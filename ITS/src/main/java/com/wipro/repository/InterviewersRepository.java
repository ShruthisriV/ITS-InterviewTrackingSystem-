package com.wipro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.model.Interviewers;

public interface InterviewersRepository extends JpaRepository<Interviewers, Integer> {
	
}
