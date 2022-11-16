package com.jobhunt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobhunt.model.Job;
import com.jobhunt.model.Status;

public interface JobRepository extends JpaRepository<Job, Long> {
	
	public List<Job> findAllByStatus(Status status);
	
	public List<Job> findAllByDesignation(String designation);
}
