package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.model.Admin;
import com.wipro.model.Candidate;
import com.wipro.repository.AdminRepository;
import com.wipro.service.CandidateService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping
public class CandidateController {
	
	@Autowired
	private CandidateService candidservice;
	
	@Autowired
	private AdminRepository adrepo;
	
	@RequestMapping("/log")
	public String loggingin()
	{
		return "login";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@PostMapping("/login")
	public String login(Admin admin,HttpSession session,Model m)
	{
		Admin a= adrepo.findByEmailAndPassword(admin.getEmail(),admin.getPassword());
		session.setAttribute("message",admin);
		if(a!=null) {
			return "home";
		}
		else {
			m.addAttribute("message","Incorrect Email or Password");
			return "login";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session,Model model)
	{
		Admin admin=(Admin) session.getAttribute("message");
		if(admin!=null)
		{
			session.removeAttribute("message");
			
		}
		model.addAttribute("logoutMessage", "Logged out successfully. Please login again.");
		return "login";

	}
	
	
	
	
}
