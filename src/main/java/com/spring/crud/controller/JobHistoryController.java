package com.spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.crud.model.JobHistoryEntity;
import com.spring.crud.services.JobHistoryServices;

@Controller
public class JobHistoryController {

	@Autowired 
	private JobHistoryServices jobHistoryService;
	
	
	@GetMapping("/jobshistories")
	public String jobs(Model model) {
		model.addAttribute("jobHistory", jobHistoryService.getJobsHistories());
		return "jobsHistories";		
	}

	@GetMapping("/jobshistories/agregar")
	public String agregar(Model model, JobHistoryEntity jobHistory) {
		
		model.addAttribute("jobHistory", jobHistory);
		return "jobsHistoriesUpdate";
	}
	
	@PostMapping("/jobhistories/insert")
	public String insert(JobHistoryEntity jobHistory) {
		
		jobHistoryService.guardar(jobHistory);
		return "redirect:/jobsHistories";
	}
	
	@GetMapping("/jobshistories/editar/{miPK.employeeId}/{miPK.startDate}")
	public String editar(JobHistoryEntity jobHistory, Model model) {
		
		jobHistory = jobHistoryService.getJobHistoryById(jobHistory.getMiPK());
		model.addAttribute("jobHistory", jobHistory);
		return "jobsHistoriesUpdate";
	}
	
	/*
	@GetMapping("/employees/eliminar/{miPk}")
	public String eliminar(PKJobHistory PKJobHistory) {
		jobHistoryService.delete(PKJobHistory);
		return "redirect:/jobshistories";
	}*/
	
	
	
	
	
	
}
