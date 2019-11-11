package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service;

import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Person;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson(int count) {
        return personRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Person getPerson(long id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person addPerson(String name, String email) {
        return personRepository.save(new Person(name, email));
    }

    public Person getPersonByEmail(String email) {
        return personRepository.findByEmail(email).orElse(null);
    }
}
