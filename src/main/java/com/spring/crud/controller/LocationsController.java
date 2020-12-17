package com.spring.crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;


import com.spring.crud.services.LocationsServices;
import com.spring.crud.model.Location;


@Controller
public class LocationsController {

	
	@Autowired
	private LocationsServices services;
	

	@GetMapping("/locations")
	public String locations(Model model) {
		model.addAttribute("location", services.listarLocations());
		return "locations";		
	}
	
	/*@GetMapping("/countries_regions")///Join
	public String countriesRegions(Model model) {
		model.addAttribute("country", countryService.listarPaises());
		return "countries_regions";
			
	}*/
	

	@GetMapping("/locations/agregar")
	public String agregar(Model model, Location location) {
		
		model.addAttribute("location", location);
		return "locationsUpdate";
	}
	
	@PostMapping("/locations/insert")
	public String insert(Location location) {
		
		services.guardar(location);
		return "redirect:/locations";
	}
	
	@GetMapping("/locations/editar/{locationId}")
	public String editar(Location location, Model model) {
		
		location = services.getLocationById(location);
		model.addAttribute("location", location);
		return "locationsUpdate";
	}
	
	@GetMapping("/locations/eliminar/{locationId}")
	public String eliminar(Location location) {
		services.delete(location);
		return "redirect:/locations";
	}
	

	
	
	
}
