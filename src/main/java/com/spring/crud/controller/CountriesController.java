package com.spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.crud.model.Country;
import com.spring.crud.services.CountriesServices;

@Controller
public class CountriesController {
	
	@Autowired 
	private CountriesServices countryService;
	
	
	@GetMapping("/countries")
	public String regions(Model model) {
		model.addAttribute("country", countryService.listarPaises());
		return "countries";		
	}
	
	@GetMapping("/countries_regions")///Join
	public String countriesRegions(Model model) {
		model.addAttribute("country", countryService.listarPaises());
		return "countries_regions";
			
	}
	

	@GetMapping("/countries/agregar")
	public String agregar(Model model, Country country) {
		
		model.addAttribute("country", country);
		return "countriesUpdate";
	}
	
	@PostMapping("/countries/insert")
	public String insert(Country country) {
		
		countryService.guardar(country);
		return "redirect:/countries";
	}
	
	@GetMapping("/countries/editar/{countryID}")
	public String editar(Country country, Model model) {
		
		country = countryService.getCountryById(country);
		model.addAttribute("country", country);
		return "countriesUpdate";
	}
	
	@GetMapping("/countries/eliminar/{countryID}")
	public String eliminar(Country country) {
		countryService.delete(country);
		return "redirect:/countries";
	}

}
