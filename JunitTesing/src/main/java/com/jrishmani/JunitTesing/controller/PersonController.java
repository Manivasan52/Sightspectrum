package com.jrishmani.JunitTesing.controller;

import com.jrishmani.JunitTesing.Service.PersonService;
import com.jrishmani.JunitTesing.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PersonController {
@Autowired
    private PersonService personService;
@GetMapping("/person")
public ResponseEntity<?>getAllPersons(){
    return ResponseEntity.ok(this.personService.getAllPerson());
}
//save all persons data
@PostMapping ("/save")
public Person updates(@RequestBody  Person person){
    return personService.saveOrUpdate(person);
}
}
