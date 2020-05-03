package com.userservices.userdata.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservices.userdata.feign.CountryServiceFeign;
import com.userservices.userdata.model.CountryDetails;

@RestController
public class UserDataController {
	private static final Log logger = LogFactory.getLog(UserDataController.class);
	@Autowired
	CountryServiceFeign countryServiceFeign;
	
	@RequestMapping(value="/user/country/detail/{id}")
	public CountryDetails getCapitalOfUser(@PathVariable(value="id") int id) {
		logger.info("Get Capital of User belongs to "+id);
		return countryServiceFeign.getCapital(id);
	}
}
