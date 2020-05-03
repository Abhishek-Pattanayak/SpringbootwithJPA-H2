package com.userservices.userdata.model;

public class CountryDetails {
	
	private int country_id;
	private String name;
	private String capital;
	private String continent;
	private String population;
	
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int id) {
		this.country_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}

}

