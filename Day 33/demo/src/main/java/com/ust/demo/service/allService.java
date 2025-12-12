package com.ust.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.model.Passport;
import com.ust.demo.model.Person;
import com.ust.demo.repository.passportRepository;
import com.ust.demo.repository.personRepository;

@Service
public class allService {
    @Autowired
    private personRepository pr;
    @Autowired
    private passportRepository ps;
    


public Person create(Person person){
  Passport passport = person.getPassport();
        if (passport != null) {
            ps.save(passport);
        }
        return pr.save(person);
    }
}
