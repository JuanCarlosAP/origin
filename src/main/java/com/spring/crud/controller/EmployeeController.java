package com.spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.crud.model.Employee;
import com.spring.crud.services.EmployeesServices;

@Controller
public class EmployeeController {

	
	@Autowired 
	private EmployeesServices employeeService;
	
	
	@GetMapping("/employees")
	public String regions(Model model) {
		model.addAttribute("employee", employeeService.getEmployees());
		return "employees";		
	}

	@GetMapping("/employees/agregar")
	public String agregar(Model model, Employee employee) {
		
		model.addAttribute("employee", employee);
		return "employeesUpdate";
	}
	
	@PostMapping("/employees/insert")
	public String insert(Employee employee) {
		
		employeeService.guardar(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/editar/{employeeId}")
	public String editar(Employee employee, Model model) {
		
		employee = employeeService.getEmployeeById(employee);
		model.addAttribute("employee", employee);
		return "employeesUpdate";
	}
	
	@GetMapping("/employees/eliminar/{employeeId}")
	public String eliminar(Employee employee) {
		employeeService.delete(employee);
		return "redirect:/employees";
	}
	
}
