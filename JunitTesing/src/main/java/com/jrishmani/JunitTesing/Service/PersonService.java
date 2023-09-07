package com.jrishmani.JunitTesing.Service;

import com.jrishmani.JunitTesing.model.Person;
import com.jrishmani.JunitTesing.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    //call the getAll persons details
    public List<Person>getAllPerson(){
        return this.personRepository.findAll();
    }
    //save for data
    public Person saveOrUpdate(Person books)
    {
        return personRepository.save(books);
    }
    //this keyword refers to current instance
    public PersonService (PersonRepository personRepository){
        this.personRepository=personRepository;
    }




}
