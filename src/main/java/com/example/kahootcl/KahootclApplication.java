package com.example.kahootcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class KahootclApplication {



	public static void main(String[] args) {
		// Load the .env file
		Dotenv dotenv = Dotenv.load();
		// Set system properties from the .env file
		System.setProperty("APPLICATION_NAME", dotenv.get("APPLICATION_NAME"));
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("HIBERNATE_DDL_AUTO", dotenv.get("HIBERNATE_DDL_AUTO"));
		System.setProperty("HIBERNATE_DIALECT", dotenv.get("HIBERNATE_DIALECT"));
		System.setProperty("SHOW_SQL", dotenv.get("SHOW_SQL"));

		System.out.println("Hello");
		SpringApplication.run(KahootclApplication.class, args);
	}

}
