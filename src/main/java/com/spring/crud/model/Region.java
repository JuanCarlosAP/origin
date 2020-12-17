package com.spring.crud.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import com.sun.istack.NotNull;


@Entity
@Table(name="REGIONS")
public class Region {
	
	@Id
	@Column(name="REGION_id")
	private Integer regionId;
	
	@Column(name="REGION_NAME")
	private String regionName;
	
	
	@OneToMany(mappedBy = "regiones")
	private List<Country> countries = new ArrayList<>();


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Integer getRegionId() {
		return regionId;
	}


	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}


	public String getRegionName() {
		return regionName;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	public List<Country> getCountries() {
		return countries;
	}


	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}


	public Region(Integer regionId, String regionName, List<Country> countries) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
		this.countries = countries;
	}


	public Region() {
		super();
	}


	@Override
	public String toString() {
		return "RegionEntity [regionId=" + regionId + ", regionName=" + regionName + ", countries=" + countries + "]";
	}


	


	


	
	
	
	
	
}
