package com.spring.crud.services;

import java.util.List;

import com.spring.crud.model.Job;


public interface JobsServices {
	
	public List<Job> getJobs();
	
	public void guardar(Job job);
	
	public void delete(Job job);
	
	public Job getJobById(Job job);
	

}
