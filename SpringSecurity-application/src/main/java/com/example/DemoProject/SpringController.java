package com.example.DemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Start")
public class SpringController {
	@GetMapping("/say")
public String getAll()
{
	return "hello world  \n"
			+ "   Login Successfully";
}
}
