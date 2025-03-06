package com.wipro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.model.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {
	

}
