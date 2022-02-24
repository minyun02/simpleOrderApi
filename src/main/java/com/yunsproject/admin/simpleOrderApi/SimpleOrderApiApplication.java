package com.yunsproject.admin.simpleOrderApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SimpleOrderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleOrderApiApplication.class, args);
	}

}
