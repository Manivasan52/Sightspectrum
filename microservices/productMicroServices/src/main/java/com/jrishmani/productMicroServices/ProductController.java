package com.jrishmani.productMicroServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
@GetMapping("/products")

public String getProduct() {
	return "Products";
}
}
