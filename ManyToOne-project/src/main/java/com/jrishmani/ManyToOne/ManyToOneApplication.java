package com.jrishmani.ManyToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToOneApplication  {
//		@Autowired
//		private  EmployeeRepo employeeRepo;
//		@Autowired
//		private  AddressRepo addressRepo;
	public static void main(String[] args) {

		SpringApplication.run(ManyToOneApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Address addr = new Address(1, "Bangloor");
//		addressRepo.save(addr);
//
//		Employee emp1 = new Employee(1, "Alpha", addr);
//		Employee emp2 = new Employee(2, "Beeta", addr);
//
//		employeeRepo.save(emp1);
//		employeeRepo.save(emp2);
//	}
}
