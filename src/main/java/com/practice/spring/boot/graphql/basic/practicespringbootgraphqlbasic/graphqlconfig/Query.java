package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.graphqlconfig;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Person;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    PersonService personService;

    public List<Person> getAllPerson(int count) {
        return personService.getAllPerson(count);
    }

    public Person getPerson(long id) {
        return personService.getPerson(id);
    }

    public Person getPersonByEmail(String email) {
        return personService.getPersonByEmail(email);
    }

}
