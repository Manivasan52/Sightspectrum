package com.example.demo;

import org.springframework.stereotype.Component;

@Component("abs")
public class InternetConnection {
private String airtel;
private int speed;
public String getAirtel() {
	return airtel;
}
public void setAirtel(String airtel) {
	this.airtel = airtel;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public void getAirtel1()
{
	System.out.println("Airtel connected");
}


}
