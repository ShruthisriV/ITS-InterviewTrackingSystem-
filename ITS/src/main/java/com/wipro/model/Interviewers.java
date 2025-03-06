package com.wipro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Interviewers")
public class Interviewers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int interviewer_id;
	private String name,role;
	
	public int getInterviewer_id() {
		return interviewer_id;
	}
	public void setInterviewer_id(int interviewer_id) {
		this.interviewer_id = interviewer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "interviewers [interviewer_id=" + interviewer_id + ", name=" + name + ", role=" + role + "]";
	}
	public Interviewers(int interviewer_id, String name, String role) {
		super();
		this.interviewer_id = interviewer_id;
		this.name = name;
		this.role = role;
	}
	public Interviewers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
