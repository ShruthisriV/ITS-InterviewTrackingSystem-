package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.model.Interviewers;

import com.wipro.service.InterviewersService;


@Controller
@RequestMapping
public class InterviewersController {
	
	@Autowired
	private InterviewersService interviewerService;


}
