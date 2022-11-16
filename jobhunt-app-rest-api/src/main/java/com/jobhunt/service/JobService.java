package com.jobhunt.service;

import java.util.List;

import com.jobhunt.model.Job;
import com.jobhunt.model.Status;

public interface JobService {
	
	public Job saveJob(Job job);
	
	public Job getJob(long id);
	
	public Job updateJob(Job job);
	
	public void deleteJob(long id);
	
	public List<Job> getAllJob();
	
	public List<Job> getAllJobByStatus(Status status);
	
	public List<Job> getAllJobByProfile(String designation);
}
