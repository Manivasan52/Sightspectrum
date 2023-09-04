package com.jrishmani;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	@Value("${spring.datasource.url}")
	private String dbUrl;
	@GetMapping("/hello")
public String sayHello() {
	return dbUrl;
}
}
