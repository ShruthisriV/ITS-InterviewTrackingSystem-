package com.wipro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
	

}
