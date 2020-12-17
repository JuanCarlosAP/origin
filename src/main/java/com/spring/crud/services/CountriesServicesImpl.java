package com.spring.crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.crud.model.Country;
import com.spring.crud.repository.CountriesRepository;


@Service
public class CountriesServicesImpl implements CountriesServices {

	
	@Autowired
	private CountriesRepository countryDao;
	
	@Transactional(readOnly=true) 
	public List<Country> listarPaises() { //lista Regiones 	
		return  (List<Country>)countryDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Country country) {
		
		countryDao.save(country);
	}

	@Transactional
	@Override
	public void delete(Country country) {
		
		countryDao.delete(country);
	}

	@Override
	@Transactional(readOnly=true)
	public Country getCountryById(Country country) { //busca por id
		
		return countryDao.findById(country.getCountryID()).orElse(null); //En caso de no encontrarlo regresa null
	}
	

	
	


}
