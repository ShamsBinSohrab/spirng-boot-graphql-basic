package com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.repository;

import com.practice.spring.boot.graphql.basic.practicespringbootgraphqlbasic.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
