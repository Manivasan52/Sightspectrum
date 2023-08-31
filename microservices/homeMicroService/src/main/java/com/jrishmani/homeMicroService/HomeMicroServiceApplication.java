package com.jrishmani.homeMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HomeMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeMicroServiceApplication.class, args);
	}

}
