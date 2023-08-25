package com.jrishmani.ManyToOne.controller;

import com.jrishmani.ManyToOne.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jrishmani.ManyToOne.service.ManyService;

import java.util.List;

@RestController
@RequestMapping("/Api")
public class ManyCOntroller {

    @Autowired
    private ManyService manyService;

    @GetMapping("/get")
    public List<Employee> fetchAllvalues() {
        return manyService.getData();

    }
    @PostMapping("/post")
    public Employee saveValues(@RequestBody Employee employee) {
       return manyService.saveData(employee);
    }
    @DeleteMapping("/dt/{id}")
    public List<Employee> deleteValues( @PathVariable Integer id)
    {
         manyService.deleteData(id);
         return (manyService.getData());
    }
}