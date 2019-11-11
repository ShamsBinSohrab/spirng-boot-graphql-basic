package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service;

import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Country;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Person;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person getPerson(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person getPersonByEmail(String email) {
        return personRepository.findByEmail(email).orElse(null);
    }

    public Person getPersonByName(String name) {
        return personRepository.findByName(name).orElse(null);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person addPerson(String name, String email, Country country) {
        return personRepository.save(new Person(name, email, country));
    }

    public List<Person> getAllPersonsByCountry(Country country) {
        return personRepository.findAllByCountry(country);
    }
}
