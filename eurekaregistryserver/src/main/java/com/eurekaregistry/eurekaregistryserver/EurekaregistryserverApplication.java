package com.eurekaregistry.eurekaregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaregistryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaregistryserverApplication.class, args);
	}

}
