package com.twilio.model;

import lombok.Data;

@Data
public class SmsModelForCall {

    private String fromMobileNumber;
    private String toMobileNumber;
}
