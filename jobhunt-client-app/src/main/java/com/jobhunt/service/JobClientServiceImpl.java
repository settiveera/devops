package com.jobhunt.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.jobhunt.model.Job;
import com.jobhunt.model.Status;
@Service
public class JobClientServiceImpl implements JobClientService {
	
	@Autowired
	private RestTemplate jobRestClient;
	
	@Value("${JOB_REST_API_URL}")
	private String jobRestApiUrl;
	
	@Value("${GET_JOB_BY_STATUS_URL}")
	private String getJobByStatus;
	
	@Value("${GET_JOB_BY_PROFILE_URL}")
	private String getJobByProfile;

	@Override
	public List<Job> getAllJobs() {
		Job[] jobs = jobRestClient.getForObject(jobRestApiUrl, Job[].class);
		List<Job> jobList = Arrays.asList(jobs);
		return jobList;
	}

	@Override
	public List<Job> getAvailableJobs(Status status) {
		Job[] availableJobs = jobRestClient.getForObject(getJobByStatus+status, Job[].class);
		List<Job> availableJobList = Arrays.asList(availableJobs);
		return availableJobList;
	}

	@Override
	public List<Job> getJobsByProfile(String designation) {
		List<Job> profileJobList = null;
		try {
			Job[] jobsByProfile = jobRestClient.getForObject(getJobByProfile+designation, Job[].class);
			profileJobList = Arrays.asList(jobsByProfile);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return profileJobList;
	}

}
