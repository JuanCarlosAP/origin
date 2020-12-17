package com.spring.crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.spring.crud.model.Department;
import com.spring.crud.services.DepartmentsServices;

@Controller
public class DepartmentsController {
	
	@Autowired
	private DepartmentsServices departmentService;


	@GetMapping("/departments")
	public String locations(Model model) {
		model.addAttribute("department", departmentService.listarDepartments());
		return "departments";		
	}
	
	/*@GetMapping("/countries_regions")///Join
	public String countriesRegions(Model model) {
		model.addAttribute("country", countryService.listarPaises());
		return "countries_regions";
			
	}*/
	

	@GetMapping("/departments/agregar")
	public String agregar(Model model, Department department) {
		
		model.addAttribute("department", department);
		return "departmentsUpdate";
	}
	
	@PostMapping("/departments/insert")
	public String insert(Department department) {
		
		departmentService.guardar(department);
		return "redirect:/departments";
	}
	
	@GetMapping("/departments/editar/{departmentId}")
	public String editar(Department department, Model model) {
		
		department = departmentService.getDepartmentById(department);
		model.addAttribute("department", department);
		return "departmentsUpdate";
	}
	
	@GetMapping("/departments/eliminar/{departmentId}")
	public String eliminar(Department department) {
		departmentService.delete(department);
		return "redirect:/departments";
	}
	
	
}
