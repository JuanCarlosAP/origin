package com.spring.crud.services;

import java.util.List;


import com.spring.crud.model.Department;

public interface DepartmentsServices {

	public List<Department> listarDepartments();
	
	public void guardar(Department department);
	
	public void delete(Department department);
	
	public Department getDepartmentById(Department department);




}
