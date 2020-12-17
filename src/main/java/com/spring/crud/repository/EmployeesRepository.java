package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.model.Employee;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Integer> {

}