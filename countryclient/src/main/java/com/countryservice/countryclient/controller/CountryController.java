package com.countryservice.countryclient.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.countryservice.countryclient.model.CountryDetails;
import com.countryservice.countryclient.service.CountryService;

@RestController
public class CountryController {
	private static final Log logger = LogFactory.getLog(CountryController.class);
	@Autowired
	private CountryService countryService;
	
	@GetMapping(value = "/country/detail/{id}")
	public CountryDetails getCapital(@PathVariable(value="id") int id) {
		logger.info("Country ID : "+id);
		return countryService.getCountryCapital(id);
	}
	
}
