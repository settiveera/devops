package com.jobhunt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobhunt.model.Job;
import com.jobhunt.model.Status;
import com.jobhunt.service.JobServiceImpl;

@RestController
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	public JobServiceImpl service;
	
	@PostMapping
	public Job saveJob(@RequestBody Job job) {
		return service.saveJob(job);
	}
	
	@GetMapping("/{id}")
	public Job getById(@PathVariable long id) {
		return service.getJob(id);
	}
	
	@PutMapping
	public Job updateJob(@RequestBody Job job) {
		return service.updateJob(job);
	}
	
	@DeleteMapping("/{id}")
	public void deleteJob(@PathVariable long id) {
		service.deleteJob(id);
	}
	
	@GetMapping
	public List<Job> getAllJob(){
		return service.getAllJob();
	}
	
	@GetMapping("/status/{status}")
	public List<Job> getAllJobByStatus(@PathVariable Status status){
		return service.getAllJobByStatus(status);
	}
	
	@GetMapping("/profile/{designation}")
	public List<Job> getAllJobByProfile(@PathVariable String designation){
		return service.getAllJobByProfile(designation);
	}
}
