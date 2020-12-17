package com.spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.crud.model.Job;
import com.spring.crud.services.JobsServices;


@Controller
public class JobController {

	@Autowired 
	private JobsServices jobService;
	
	
	@GetMapping("/jobs")
	public String jobs(Model model) {
		model.addAttribute("job", jobService.getJobs());
		return "jobs";		
	}

	@GetMapping("/jobs/agregar")
	public String agregar(Model model, Job job) {
		
		model.addAttribute("job", job);
		return "jobUpdate";
	}
	
	@PostMapping("/jobs/insert")
	public String insert(Job job) {
		
		jobService.guardar(job);
		return "redirect:/jobs";
	}
	
	@GetMapping("/jobs/editar/{jobId}")
	public String editar(Job job, Model model) {
		
		job = jobService.getJobById(job);
		model.addAttribute("job", job);
		return "jobsUpdate";
	}
	
	@GetMapping("/employees/eliminar/{jobId}")
	public String eliminar(Job job) {
		jobService.delete(job);
		return "redirect:/jobs";
	}
	

	
}
