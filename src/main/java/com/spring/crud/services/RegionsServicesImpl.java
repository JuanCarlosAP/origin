package com.spring.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.crud.model.Region;
import com.spring.crud.repository.RegionsRepository;

@Service
public class RegionsServicesImpl implements RegionsServices {

	@Autowired
	private RegionsRepository regionsDao;
	
	@Transactional(readOnly=true) 
	public List<Region> listarRegiones() { //lista Regiones 
		
		return (List<Region>) regionsDao.findAll();
	}

	@Transactional //Realiza commit en caso de realizar la operacion correctamente o rollback si ocurre algun error
	public void guardar(Region region) { //Crea
	
		regionsDao.save(region);
	}

	@Transactional
	public void delete(Region region) { ///Elimina
		
		regionsDao.delete(region);
	}
	
	@Transactional(readOnly=true)
	public Region getById(Region region) { //busca por id
		
		return regionsDao.findById(region.getRegionId()).orElse(null); //En caso de no encontrarlo regresa null
	}

}
