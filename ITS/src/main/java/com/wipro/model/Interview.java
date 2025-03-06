package com.wipro.model;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Interviews")
public class Interview {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int interview_id;
	
	private int candidate_id;
	@ManyToOne
	@JoinColumn(name = "tech_id")
	private Interviewers techPanelInterviewer;

	@ManyToOne
	@JoinColumn(name = "hr_id")
	private Interviewers hrPanelInterviewer;
	private LocalDateTime scheduledDate;
	private String status;
	
	public int getInterview_id() {
		return interview_id;
	}
	public void setInterview_id(int interview_id) {
		this.interview_id = interview_id;
	}
	public int getCandidate_id() {
		return candidate_id;
	}
	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}
	public Interviewers getTechPanelInterviewer() {
		return techPanelInterviewer;
	}
	public void setTechPanelInterviewer(Interviewers techPanelInterviewer) {
		this.techPanelInterviewer = techPanelInterviewer;
	}
	public Interviewers getHrPanelInterviewer() {
		return hrPanelInterviewer;
	}
	public void setHrPanelInterviewer(Interviewers hrPanelInterviewer) {
		this.hrPanelInterviewer = hrPanelInterviewer;
	}
	public LocalDateTime getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(LocalDateTime scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
