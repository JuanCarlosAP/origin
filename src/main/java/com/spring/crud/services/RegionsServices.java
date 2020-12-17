package com.spring.crud.services;
import java.util.List;

import com.spring.crud.model.Region;

public interface RegionsServices {
	
	public List<Region> listarRegiones();
	
	public void guardar(Region region);
	
	public void delete(Region region);
	
	public Region getById(Region region);
	
	

}
