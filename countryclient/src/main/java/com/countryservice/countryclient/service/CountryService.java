package com.countryservice.countryclient.service;

import org.springframework.stereotype.Service;

import com.countryservice.countryclient.model.CountryDetails;

@Service
public class CountryService {
public CountryDetails getCountryCapital(int id) {
	if(id == 91) {
		CountryDetails countryDetails = new CountryDetails();
		countryDetails.setCountry_id(id);
		countryDetails.setName("India");
		countryDetails.setCapital("Delhi");
		countryDetails.setContinent("Asia");
		countryDetails.setPopulation("130B");
		return countryDetails;
	}else {
		return null;
	}
}
}
