package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.graphqlconfig;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Person;
import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private PersonService personService;

    public Person addPerson(String name, String email) {
        return personService.addPerson(name, email);
    }
}
