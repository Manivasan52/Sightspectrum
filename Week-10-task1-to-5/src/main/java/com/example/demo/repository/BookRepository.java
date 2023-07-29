package com.example.demo.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Books_Details;
@EnableJpaRepositories
public interface BookRepository extends CrudRepository<Books_Details, Integer> {

	

}