package com.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigitalBookUserServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(DigitalBookUserServiceApplication.class, args);
		System.out.println("Running");
	}

}
