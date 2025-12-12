package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.model.Person;
@Repository
public interface personRepository extends JpaRepository<Person, Integer> {


}
