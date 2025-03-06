package com.wipro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.model.Candidate;

import com.wipro.repository.CandidateRepository;


@Service
public class CandidateService {
	
	private CandidateRepository candidateRepo;

	public CandidateService(CandidateRepository candidateRepo) {
		this.candidateRepo=candidateRepo;
	}

}
