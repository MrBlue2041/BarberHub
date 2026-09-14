package com.mrblue.BarberHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BarberhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarberhubApplication.class, args);

		HealthController healthController;
	}

}
