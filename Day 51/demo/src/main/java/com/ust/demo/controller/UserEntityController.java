package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.repository.UserEntityRepository;
import com.ust.demo.userEntity.user;

@RestController
@RequestMapping
public class UserEntityController {
@Autowired
private UserEntityRepository ur;
@Autowired
private  PasswordEncoder passwordEncoder;

@PostMapping("/adduser")
public user addUser(@RequestBody user a){
    a.setPassword(passwordEncoder.encode(a.getPassword()));
   return  ur.save(a);

}	
@GetMapping("/userList")
public List<user> findAlluser(){
    return ur.findAll();
}
@GetMapping("/userList/{id}")
public Optional<user> findbyid(@PathVariable("id") Long id){
    return ur.findById(id);
}







}
