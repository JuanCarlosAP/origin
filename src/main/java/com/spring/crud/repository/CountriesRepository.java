package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.model.Country;

public interface CountriesRepository extends JpaRepository<Country, String> {

}
