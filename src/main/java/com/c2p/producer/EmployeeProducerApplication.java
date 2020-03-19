package com.c2p.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.c2p.domain.Employee;

@SpringBootApplication
@Configuration
public class EmployeeProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerApplication.class, args);
		Employee emp=new Employee();
		
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
