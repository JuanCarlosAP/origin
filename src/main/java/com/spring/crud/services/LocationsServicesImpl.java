package com.spring.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.crud.model.Location;
import com.spring.crud.repository.LocationsRepository;

@Service
public class LocationsServicesImpl implements LocationsServices {

	
	@Autowired
	private LocationsRepository locationRepo;

	@Override
	@Transactional(readOnly =true)
	public List<Location> listarLocations() {
		return (List<Location>)locationRepo.findAll();
	}

	@Override
	@Transactional
	public void guardar(Location location) {
		locationRepo.save(location);
	}

	@Override
	@Transactional
	public void delete(Location location) {
		locationRepo.delete(location);
	}

	@Override
	@Transactional(readOnly =true)
	public Location getLocationById(Location location) {
		return locationRepo.findById(location.getLocationId()).orElse(null); //En caso de no encontrarlo regresa null
	}
	
	
	
	

}
