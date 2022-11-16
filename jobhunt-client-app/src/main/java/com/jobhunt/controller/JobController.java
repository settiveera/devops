package com.jobhunt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobhunt.model.Job;
import com.jobhunt.model.Status;
import com.jobhunt.service.JobClientServiceImpl;

@Controller
public class JobController {
	
	@Autowired
	private JobClientServiceImpl service;
	
	@GetMapping("/show-all")
	public String showAllJobs(Model m){
		List<Job> allJobs = service.getAllJobs();
		m.addAttribute("jobs", allJobs);
		return "show-all.jsp";
	}
	
	@GetMapping("/show-status")
	public String showAllAvailableJobs(@RequestParam("status") Status status,Model m) {
		List<Job> allAvailableJobs = service.getAvailableJobs(status);
		m.addAttribute("availableJobs", allAvailableJobs);
		return "show-status.jsp";
	}
	
	@GetMapping("/show-profile")
	public String showJobsByProfile(@RequestParam("profile") String designation,Model m) {
		List<Job> jobsByProfile = service.getJobsByProfile(designation);
		if(jobsByProfile.isEmpty()) {
			m.addAttribute("errorProfileMsg", "Job related to profile not found !!!");
			return "show-profile.jsp";
		}
		m.addAttribute("jobsByProfile",jobsByProfile);
		return "show-profile.jsp";
	}
}
