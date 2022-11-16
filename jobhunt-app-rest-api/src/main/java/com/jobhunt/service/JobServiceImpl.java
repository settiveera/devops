package com.jobhunt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobhunt.exception.DuplicateJobIdException;
import com.jobhunt.exception.ProfileNotFoundException;
import com.jobhunt.model.Job;
import com.jobhunt.model.Status;
import com.jobhunt.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	public JobRepository repo;

	@Override
	public Job saveJob(Job job) {
		if(repo.existsById(job.getJobId())) {
			throw new DuplicateJobIdException("Duplicate Job id : "+job.getJobId()+". Id Already exists.");
		}
		return repo.save(job);
	}

	@Override
	public Job getJob(long id) {
		return repo.findById(id).orElseThrow(()->new DuplicateJobIdException("Job id : "+id+" is not valid."));
	}

	@Override
	public Job updateJob(Job job) {
		if(!(repo.existsById(job.getJobId()))) {
			throw new DuplicateJobIdException("Duplicate Job id : "+job.getJobId()+". Id not exists.");
		}
		return repo.save(job);
	}

	@Override
	public void deleteJob(long id) {
		if(!(repo.existsById(id))) {
			throw new DuplicateJobIdException("Duplicate Job id : "+id+". Id not exists.");
		}
		repo.deleteById(id);

	}

	@Override
	public List<Job> getAllJob() {
		return repo.findAll();
	}

	@Override
	public List<Job> getAllJobByStatus(Status status) {
		return repo.findAllByStatus(status);
	}

	@Override
	public List<Job> getAllJobByProfile(String designation) {
		ArrayList<Job> jobList=(ArrayList<Job>) repo.findAllByDesignation(designation);
		
		if(jobList.size()==0) {
			throw new ProfileNotFoundException("User not found");
		}
		
		return jobList;
	}

}
