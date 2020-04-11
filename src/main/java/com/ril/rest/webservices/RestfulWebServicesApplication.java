package com.ril.rest.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	private static final Logger log = LoggerFactory.getLogger(RestfulWebServicesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
		log.info("Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	}

}
