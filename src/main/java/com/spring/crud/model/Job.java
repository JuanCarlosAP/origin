package com.spring.crud.model;

import javax.persistence.*;
@Entity
@Table(name = "JOBS")
public class Job {
	
	@Id
	@Column(name ="JOB_ID")
	private String jobId;
	
	@Column(name = "JOB_TITLE")
	private String jobTitle;
	
	@Column(name = "MIN_SALARY")
	private int minSalary;
	
	@Column(name = "MAX_SALARY")
	private int maxSalary;
	
	
	public Job() {	}

	public Job(String jobId, String jobTitle, int minSalary, int maxSalary) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "JobsEntity [jobId=" + jobId + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + "]";
	}
	
}
