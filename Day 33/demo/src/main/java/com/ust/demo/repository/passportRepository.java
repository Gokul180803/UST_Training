package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.model.Passport;
@Repository
public interface passportRepository extends JpaRepository<Passport, Integer> {

}
