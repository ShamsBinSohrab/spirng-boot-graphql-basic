package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.graphqlconfig;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Country;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Person;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Vehicle;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service.PersonService;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    PersonService personService;
    @Autowired
    VehicleService vehicleService;

    public Person person(Long id) {
        return personService.getPerson(id);
    }

    public Person personByName(String name) {
        return personService.getPersonByName(name);
    }

    public Person personByEmail(String email) {
        return personService.getPersonByEmail(email);
    }

    public List<Person> persons() {
        return personService.getAllPersons();
    }

    public List<Person> personsByCountry(Country country) {
        return personService.getAllPersonsByCountry(country);
    }

    public List<Vehicle> vehicles() {
        return vehicleService.getAllVehicles();
    }

}
