package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Brand brand;
    private Color color;
    @OneToOne
    private Person owner;
    private String vehicleRegNo;

    public Vehicle() {
    }

    public Vehicle(Brand brand, Color color, Person owner, String vehicleRegNo) {
        this.brand = brand;
        this.color = color;
        this.owner = owner;
        this.vehicleRegNo = vehicleRegNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
