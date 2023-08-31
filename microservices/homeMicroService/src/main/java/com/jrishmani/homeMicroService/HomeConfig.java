package com.jrishmani.homeMicroService;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HomeConfig {
    @Bean
    @LoadBalanced
     RestTemplate getrestTemplate() {
	RestTemplate restTemplate=new RestTemplate();
	return restTemplate;
}
}
