package com.ust.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.UserEntity;
import com.ust.demo.service.userService;

@RestController
@RequestMapping
public class userController {
    @Autowired
    private userService us;
    @Autowired
    private PasswordEncoder encoder;
@PostMapping("/adduser")
    public UserEntity addUser(@RequestBody UserEntity userEntity){
        userEntity.setPassword(encoder.encode(userEntity.getPassword()));
        return us.addUser(userEntity);

    }
    @GetMapping("/finduser")
    public List<UserEntity> findAll(){
        return us.findall();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        us.deleteUser(id);
        return "Deleted";
    }


}
