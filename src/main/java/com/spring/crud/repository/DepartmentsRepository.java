package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.model.Department;

@Repository
public interface DepartmentsRepository extends  JpaRepository<Department, Integer>{
	

	
	
}
