package com.jrishmani.ManyToOne.service;


import com.jrishmani.ManyToOne.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.jrishmani.ManyToOne.repo.EmployeeRepo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ManyService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getData(){
        return employeeRepo.findAll();

    }

    public Employee saveData(Employee emp1){
        return employeeRepo.save(emp1);
    }

    public List<Employee> deleteData(Integer id)
    {
         employeeRepo.deleteById(id);
         return (employeeRepo.findAll());
    }
}
