package com.jobhunt.service;

import java.util.List;

import com.jobhunt.model.Job;
import com.jobhunt.model.Status;

public interface JobClientService {
	
	public List<Job> getAllJobs();
	
	public List<Job> getAvailableJobs(Status status);
	
	public List<Job> getJobsByProfile(String designation);
}
