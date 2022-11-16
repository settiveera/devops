package com.jobhunt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jobId;
	
	@Column(nullable = false,length = 30)
	private String companyName;
	
	@Column(nullable = false,length = 20)
	private String designation;
	
	@Column(nullable = false,length = 100)
	private String profileDesc;
	
	@Column(nullable = false)
	private int experience;
	
	@Column(nullable = false)
	private double salary;
	
	@Column(nullable = false)
	private String companyUrl;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Job() {
		
	}

	public Job(long jobId, String companyName, String designation, String profileDesc, int experience, double salary,
			String companyUrl, Status status) {
		super();
		this.jobId = jobId;
		this.companyName = companyName;
		this.designation = designation;
		this.profileDesc = profileDesc;
		this.experience = experience;
		this.salary = salary;
		this.companyUrl = companyUrl;
		this.status = status;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getProfileDesc() {
		return profileDesc;
	}

	public void setProfileDesc(String profileDesc) {
		this.profileDesc = profileDesc;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompanyUrl() {
		return companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", companyName=" + companyName + ", designation=" + designation
				+ ", profileDesc=" + profileDesc + ", experience=" + experience + ", salary=" + salary + ", companyUrl="
				+ companyUrl + ", status=" + status + "]";
	}
	
	
}
