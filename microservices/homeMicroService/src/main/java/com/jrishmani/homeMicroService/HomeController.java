package com.jrishmani.homeMicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	private RestTemplate restTemplate;
@GetMapping("/home")
public String getHome() {
	String products=restTemplate.getForObject("http://PRODUCT-MICROSERVICES/products", String.class);
	return products;
//	return "mani";
}
}
