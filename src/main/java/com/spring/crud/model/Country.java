package com.spring.crud.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="Countries")
public class Country {
	
	@Id
	@Column(name="COUNTRY_ID")
	private String countryID;
	//@GeneratedValue(strategy=GenerationType.IDENTITY) 
	
	 
	@Column(name="COUNTRY_NAME") ///******
	public String countryName;
	
	/*@OneToOne()
	@JoinColumn(name = "REGION_ID")
	private RegionEntity region;
	///Para asignar un id se deben revisar los id ya existentes de la tabla region_id
*/
	
	
	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	private Region regiones;
	
	@OneToMany(mappedBy = "countries")
	private List<Location> locations = new ArrayList<>();

	
	

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Region getRegiones() {
		return regiones;
	}

	public void setRegiones(Region regiones) {
		this.regiones = regiones;
	}




	public Country(String countryID, String countryName, Region regiones, List<Location> locations) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
		this.regiones = regiones;
		this.locations = locations;
	}

	public Country() {
		super();
	}

	@Override
	public String toString() {
		return "CountryEntity [countryID=" + countryID + ", countryName=" + countryName + ", regiones=" + regiones
				+ ", locations=" + locations + "]";
	}

	
	
	
	
	
	





	
	

	
}
