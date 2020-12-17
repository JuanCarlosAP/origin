package com.spring.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.crud.model.Department;
import com.spring.crud.repository.DepartmentsRepository;

@Service
public class DepartmentsServicesImpl implements DepartmentsServices {

	
	@Autowired //inyecta **
	private DepartmentsRepository repoDepartments;

	@Override
	@Transactional(readOnly=true)
	public List<Department> listarDepartments() {
		return repoDepartments.findAll();
	}

	@Override
	@Transactional
	public void guardar(Department department) {
		repoDepartments.save(department);
		
	}

	@Override
	@Transactional
	public void delete(Department department) {
		repoDepartments.delete(department);
	}

	@Override
	@Transactional(readOnly=true)
	public Department getDepartmentById(Department department) {
		return repoDepartments.findById(department.getLocationId()).orElse(null); //En caso de no encontrarlo regresa null
	}
	
	

}
