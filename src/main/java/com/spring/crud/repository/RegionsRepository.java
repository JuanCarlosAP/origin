package com.spring.crud.repository;

import org.springframework.data.repository.CrudRepository;
import com.spring.crud.model.Region;

public interface RegionsRepository extends CrudRepository<Region, Integer>{
	
	//accede a los metodos ya definidos de crudRepository

}
