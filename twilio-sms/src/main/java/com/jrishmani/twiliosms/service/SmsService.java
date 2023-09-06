package com.jrishmani.twiliosms.service;

import com.jrishmani.twiliosms.modal.Sms;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SmsService {
  //  @Value("#{systemEnvironment['TWILIO_ACCOUNT_SID']}")
    private String  SID = "AC727792e0da45fc135956a1516ef69693";
   // @Value("#{systemEnvironment['TWILIO_AUTH_TOKEN']}")
    private String authToken = "1cb62bd5bb1114f7ed198d00f816f134";
  //  @Value("#{systemEnvironment['TWILIO_PHONE_NUMBER']}")
    private String  fromPhoneNumber ="+19209498585";
  //  @Value("#{systemEnvironment['TO_PHONE_NUMBER']}")
  //  private   String toPhoneNumber;


    @PostConstruct
    public void setUp() {
        Twilio.init(SID, authToken);
    }
    public String sendSms(String toPhoneNumber, String smsMessage){
        Twilio.init(SID,authToken);

        Message message=Message.creator(new PhoneNumber(toPhoneNumber),new PhoneNumber(fromPhoneNumber)
                , smsMessage).create();
        log.info("sms triggered successfully and the sid :",message.getSid());
        return message.getStatus().toString();
    }
}
