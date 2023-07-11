package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {
private String name;
@Autowired
@Qualifier("abs")
private InternetConnection con;
Home()
{
	System.out.println("Constructor called");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
private int number;
public void ConnectName()
{
	con.getAirtel1();
	System.out.println("My Spring Boot Application connected");
}

}
