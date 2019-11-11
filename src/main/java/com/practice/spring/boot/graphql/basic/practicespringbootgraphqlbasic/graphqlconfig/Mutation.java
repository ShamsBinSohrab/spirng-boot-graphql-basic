package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.graphqlconfig;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.*;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service.PersonService;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private PersonService personService;
    @Autowired
    private VehicleService vehicleService;

    public Person addPerson(String name, String email, Country country) {
        return personService.addPerson(name, email, country);
    }

    public Vehicle addVehicle(Brand brand, Color color, String ownerName, String vehicleRegNo) {
        return vehicleService.addVehicle(brand, color, ownerName, vehicleRegNo);
    }
}
