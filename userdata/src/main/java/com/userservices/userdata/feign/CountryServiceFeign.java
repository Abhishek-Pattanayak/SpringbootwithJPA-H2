package com.userservices.userdata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.userservices.userdata.model.CountryDetails;

@FeignClient(name = "countries-service")
public interface CountryServiceFeign {
		@GetMapping(value="/country/detail/{id}")
		public CountryDetails getCapital(@PathVariable(value="id") int id);
}
