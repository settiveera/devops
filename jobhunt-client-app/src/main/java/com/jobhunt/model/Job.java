package com.jobhunt.model;

public class Job {

	private long jobId;
	
	private String companyName;
	
	private String designation;
	
	private String profileDesc;
	
	private int experience;
	
	private double salary;
	
	private String companyUrl;
	
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
