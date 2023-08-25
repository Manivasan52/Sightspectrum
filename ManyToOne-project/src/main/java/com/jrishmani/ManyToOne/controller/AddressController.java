package com.jrishmani.ManyToOne.controller;

import com.jrishmani.ManyToOne.model.Address;
import com.jrishmani.ManyToOne.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepo addressRepo;

    public List<Address> getData(){
        return addressRepo.findAll();
    }

    public Address saveData(@RequestBody Address address){

        return addressRepo.save(address);

    }
}
