package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.repository;

import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByName(String name);
    Optional<Person> findByEmail(String email);
}
