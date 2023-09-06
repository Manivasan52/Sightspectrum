package com.jrishmani.twiliosms.resources;

import com.jrishmani.twiliosms.modal.Sms;
import com.jrishmani.twiliosms.service.SmsService;
import com.twilio.twiml.fax.Receive;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
@Slf4j
public class SmsController {
    @Autowired
   private SmsService smsService;
//    @Autowired
//   private SimpMessagingTemplate webSocket;
//
//    private static final String TOPIC_NAME="/topic/sms";

//@RequestMapping(value = "/sms",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Object> sendSms(@RequestBody Sms sms){
//        try
//        {
//            smsService.sendSms(sms);
//
//        }catch (Exception e)
//        {
//            webSocket.convertAndSend(TOPIC_NAME,getDateAndTime()+"Failed to send an sms");
//        }
//        webSocket.convertAndSend(TOPIC_NAME,getDateAndTime()+" Message  has been delivered successfully");
//    return ResponseEntity.ok().build();
//    }

//    private String getDateAndTime() {
//       return DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm::ss").format(LocalDateTime.now());
//
//    }

    @PostMapping("/makeMessage")
    public ResponseEntity<?> sendSms(@RequestBody Sms smsModel){

        log.info("processing started"+smsModel);

        smsService.sendSms(smsModel.getToPhoneNum(),smsModel.getMessage());
        return new ResponseEntity<>("Message sent Successfully", HttpStatus.OK);
    }




}
