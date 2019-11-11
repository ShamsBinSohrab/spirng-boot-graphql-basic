package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service;

import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Brand;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Color;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Person;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Vehicle;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private PersonService personService;
    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle addVehicle(Brand brand, Color color, String ownerName, String vehicleRegNo) {
        Person owner = personService.getPersonByName(ownerName);
        return vehicleRepository.save(new Vehicle(brand, color, owner, vehicleRegNo));
    }
}
