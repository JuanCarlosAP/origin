package com.spring.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.crud.model.Job;
import com.spring.crud.repository.JobsRepository;

@Service
public class JobsServicesImpl implements JobsServices {

	@Autowired
	private JobsRepository jobsRepo;

	@Override
	@Transactional(readOnly = true)
	public List<Job> getJobs() {
		return jobsRepo.findAll();
	}

	@Override
	@Transactional
	public void guardar(Job job) {
		jobsRepo.save(job);
	}

	@Override
	@Transactional
	public void delete(Job job) {
		jobsRepo.delete(job);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Job getJobById(Job job) {
		return jobsRepo.findById(job.getJobId()).orElse(null); //En caso de no encontrarlo regresa null
	}


}
