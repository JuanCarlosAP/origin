package com.spring.crud.model;
import javax.persistence.*;

@Entity
@Table(name = "LOCATIONS")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="LOCATIONS_SEQ")
    @SequenceGenerator(name="LOCATIONS_SEQ", sequenceName = "LOCATIONS_SEQ", allocationSize=1)
	@Column(name = "LOCATION_ID")
	private Integer locationId;
	
	@Column(name = "STREET_ADDRESS")
	private String streetAddres;
	
	@Column(name = "POSTAL_CODE")
	private String postalCode;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE_PROVINCE")
	private String stateProvince;
	
	@Column(name = "COUNTRY_ID")
	private String countryId;
	
	@ManyToOne //**ERROR insertable = false, updatable = false
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID", insertable = false, updatable = false)  //ID de la bd
	private Country countries;

	

	public Country getCountries() {
		return countries;
	}



	public void setCountries(Country countries) {
		this.countries = countries;
	}



	public Location() {	}
	
	
	
	

	public Location(Integer locationId, String streetAddres, String postalCode, String city, String stateProvince,
			String countryId, Country countries) {
		super();
		this.locationId = locationId;
		this.streetAddres = streetAddres;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryId = countryId;
		this.countries = countries;
	}



	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getStreetAddres() {
		return streetAddres;
	}

	public void setStreetAddres(String streetAddres) {
		this.streetAddres = streetAddres;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}



	@Override
	public String toString() {
		return "LocationEntity [locationId=" + locationId + ", streetAddres=" + streetAddres + ", postalCode="
				+ postalCode + ", city=" + city + ", stateProvince=" + stateProvince + ", countryId=" + countryId
				+ ", countries=" + countries + "]";
	}

}
