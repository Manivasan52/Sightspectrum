package com.demoaop.service;

import com.demoaop.model.AopModel;
import com.demoaop.repository.AopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AopService {

    @Autowired
    private AopRepository aopRepository;

    public ResponseEntity<List<AopModel>> getAllDetails(){
        return new ResponseEntity<>(aopRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<String> saveAllDetails(AopModel aopModel) throws Exception {

        if(aopModel.getName().length()>5){
            throw new Exception("please reduce the size of your name");
        }
        aopRepository.save(aopModel);
        return new ResponseEntity<>("Created Successfully",HttpStatus.CREATED);
    }

    public ResponseEntity<String> updateAllDetails(int id,AopModel aopModel) {
        AopModel model = aopRepository.findById(id).orElseThrow();

        model.setName(aopModel.getName());
        model.setLocation(aopModel.getLocation());

        aopRepository.save(model);

        return new ResponseEntity<>("updated successfully", HttpStatus.OK);

    }
}
