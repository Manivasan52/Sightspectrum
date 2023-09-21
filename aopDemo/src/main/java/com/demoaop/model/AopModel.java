package com.demoaop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Aop_Details")
public class AopModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public Object getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setLocation(Object location2) {
		// TODO Auto-generated method stub
		
	}

}
