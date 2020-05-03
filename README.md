# SpringbootwithJPA-H2
Spring boot microservices with JPA-H2 In Memory Database Example. It is the enhancement of my previous microservices Example which has Eureka and Feign integrated.

# Explanation
The spring boot data JPA has been integrated with H2 in memory database for DB operations. We have one save method to save the country details to DB and another method to retrieve country details by passing the country id.
We have one entity class called CountryDetails which will create an empty COUNTRYDETAILS table in H2 database and the insert query in the data.sql file under resoirces will insert 3 rows into it. 
If you want to test only JPA implementation then you can only start countryclient service by removing all Eureka related entries.

# Steps to test the application
Once services start, you can go to H2 Console (http://localhost:8000/h2-console) and login. You may need to change the jdbc url while login as jdbc:h2:mem:testdb, and can connect without providing any password.

If you want to save new country details, then hit the below URL with method body,

http://localhost:8000/country/detail/save
	  {
      "country_id": 33,
      "name": "France",
      "capital": "Paris",
      "continent": "Europe",
      "population": "65M"
    }
    
If you want to retrieve country details then hit the below URL with country_id (you can do it either using countryclient service or userdata service)
Using countryclient service
http://localhost:8000/country/detail/33

Using userdata service
http://localhost:8001/user/country/detail/91
