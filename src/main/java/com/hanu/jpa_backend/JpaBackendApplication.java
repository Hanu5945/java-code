package com.hanu.jpa_backend;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaBackendApplication {

	@PersistenceContext
	EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(JpaBackendApplication.class, args);
	}
}
