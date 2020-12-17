package com.spring.crud.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.crud.model.Region;
import com.spring.crud.model.Country;
import com.spring.crud.services.CountriesServices;
import com.spring.crud.services.RegionsServices;



@Controller
public class RegionsController {
	
	
	@Autowired //inyecta regionsservices
	private RegionsServices regionService;
	
	@Autowired
	CountriesServices countryService;
	
	
	@GetMapping("/regions")
	public String regions(Model model) {
		
		List<Region> regions = new ArrayList<Region>();

		regions = regionService.listarRegiones();
	
		model.addAttribute("regions", regions);

		return "regions";	
	}
	
	@GetMapping("/regions_countries")///Join
	public String countriesRegions(Model model, Region region, Country country) {

		model.addAttribute("region", regionService.listarRegiones());
		return "regions_countries";
			
	}
	
	
	@GetMapping("/regions/agregar")
	public String agregar(Model model, Region region) {
		
		model.addAttribute("region", region);
		return "regionsUpdate";
	}
	
	@PostMapping("/regions/insert")
	public String insert(Region region) {
		
		regionService.guardar(region);
		return "redirect:/regions";
	}
	
	@GetMapping("/regions/editar/{regionId}")
	public String editar(Region region, Model model) {
		
		region = regionService.getById(region);
		model.addAttribute("region", region);
		return "regionsUpdate";
	}
	
	@GetMapping("/regions/eliminar/{regionId}")
	public String eliminar(Region region) {
		regionService.delete(region);
		return "redirect:/regions";
	}
	
	@GetMapping("/")
	public String principal() {
		
		return "tables";
	}
	
	

	
}
