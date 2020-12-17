package com.spring.crud.services;

import java.util.List;
import com.spring.crud.model.Employee;


public interface EmployeesServices {

	public List<Employee> getEmployees();
	
	public void guardar(Employee employee);
	
	public void delete(Employee employee);
	
	public Employee getEmployeeById(Employee employee);
	
	
	
}
