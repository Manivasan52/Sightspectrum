package com.demoaop.controller;


import com.demoaop.model.AopModel;
import com.demoaop.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aop")
public class AopController {

    @Autowired
    private AopService aopService;

    @GetMapping("/get")
    public ResponseEntity<List<AopModel>> fetchAllDetails(){
        return aopService.getAllDetails();
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveAllDetailsInApoDB(@RequestBody AopModel aopModel) throws Exception {
        return aopService.saveAllDetails(aopModel);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAllDetails(@PathVariable int id,@RequestBody AopModel aopModel){
        return aopService.updateAllDetails(id,aopModel);
    }
}
