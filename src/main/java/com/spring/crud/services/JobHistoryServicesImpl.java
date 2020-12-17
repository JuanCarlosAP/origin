package com.spring.crud.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.crud.model.JobHistoryEntity;
import com.spring.crud.model.PKJobHistory;
import com.spring.crud.repository.JobHistoryRepository;


@Service
public class JobHistoryServicesImpl implements JobHistoryServices {

	@Autowired 
	private JobHistoryRepository jobRepo;

	@Override
	public List<JobHistoryEntity> getJobsHistories() {
		return jobRepo.findAll();
	}

	@Override
	public void guardar(JobHistoryEntity jobHistory) {
		jobRepo.save(jobHistory);
	}

	@Override
	public void delete(PKJobHistory pk) {
		jobRepo.deleteById(pk);
	}

	@Override
	public JobHistoryEntity getJobHistoryById(PKJobHistory pk) {
		return jobRepo.findById(pk).orElse(null); 
	}
	
}
