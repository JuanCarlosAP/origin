package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.model.Location;


@Repository
public interface LocationsRepository extends JpaRepository<Location, Integer> {
	
	

}
