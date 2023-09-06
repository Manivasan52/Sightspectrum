package com.jrishmani.twiliosms.modal;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Sms {


    private String toPhoneNum;
    private String message;

}
