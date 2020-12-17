package com.spring.crud.services;

import java.util.List;
import com.spring.crud.model.Location;


public interface LocationsServices {

	public List<Location> listarLocations();
	
	public void guardar(Location location);
	
	public void delete(Location location);
	
	public Location getLocationById(Location location);
	
}
