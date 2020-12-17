package com.spring.crud.services;

import java.util.List;
import com.spring.crud.model.Country;



public interface CountriesServices {

	
	public List<Country> listarPaises();
	
	public void guardar(Country country);
	
	public void delete(Country country);
	
	public Country getCountryById(Country country);
	
	
}
