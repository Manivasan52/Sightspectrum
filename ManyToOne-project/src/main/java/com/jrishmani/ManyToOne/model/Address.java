package com.jrishmani.ManyToOne.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String location;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "address")
    private List<Employee> employees = new ArrayList<>();
    public Address(int addressId, String location) {
        super();
        this.addressId = addressId;
        this.location = location;
    }

    public Address() {
        super();
    }

    public int getAddressId() {
        return addressId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", location='" + location + '\'' +
                ", employees=" + employees +
                '}';
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
