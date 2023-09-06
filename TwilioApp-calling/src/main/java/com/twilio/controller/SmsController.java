package com.twilio.controller;

import com.twilio.model.SmsModelForCall;
import com.twilio.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/api")

public class SmsController {

    @Autowired
    private SmsService smsService;
//
//    @PostMapping("/makeMessage")
//    public ResponseEntity<?> sendSms(@RequestBody SmsModelMessage smsModel){
//
//        log.info("processing started"+smsModel);
//
//         smsService.sendSms(smsModel.getDestinationMobileNumber(),smsModel.getMessage());
//        return new ResponseEntity<>("Message sent Successfully", HttpStatus.OK);
//    }



    @PostMapping("/makeCall")
    public ResponseEntity<?> makeCall(@RequestBody SmsModelForCall smsModelForCall){
         smsService.makeCall(smsModelForCall.getFromMobileNumber(),smsModelForCall.getToMobileNumber());
        return new ResponseEntity<>("Call Initiated Successfully", HttpStatus.CREATED);

    }




}
