package com.ust.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.model.Person;
import com.ust.demo.service.allService;

@RestController
@RequestMapping("/person")
public class allController {
    @Autowired
private allService as;
    @PostMapping
public Person create(@RequestBody Person person){
  return   as.create(person);
}

}
