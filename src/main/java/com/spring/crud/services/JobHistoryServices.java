package com.spring.crud.services;

import java.util.List;
import com.spring.crud.model.Job;
import com.spring.crud.model.JobHistoryEntity;
import com.spring.crud.model.PKJobHistory;


public interface JobHistoryServices {
	
	public List<JobHistoryEntity> getJobsHistories();
	
	public void guardar(JobHistoryEntity jobHistory);
	
	public void delete(PKJobHistory pk);
	
	public JobHistoryEntity getJobHistoryById(PKJobHistory pk);
	
	
}
