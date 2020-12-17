package com.spring.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.crud.model.Employee;
import com.spring.crud.repository.EmployeesRepository;

@Service
public class EmployeesServicesImpl implements EmployeesServices {

	
	@Autowired 
	private EmployeesRepository employeeRepo;

	@Override
	@Transactional(readOnly=true)
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	@Transactional
	public void guardar(Employee employee) {
		employeeRepo.save(employee);
		
	}

	@Override
	@Transactional
	public void delete(Employee employee) {
		employeeRepo.delete(employee);
		
	}

	@Transactional(readOnly=true)
	@Override
	public Employee getEmployeeById(Employee employee) {
		return employeeRepo.findById(employee.getEmployeeId()).orElse(null);
	}
	
	
}
