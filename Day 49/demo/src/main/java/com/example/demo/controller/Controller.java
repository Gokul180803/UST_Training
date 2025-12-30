package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/home")
    public String home(){
        return "Home";
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
    @GetMapping("/contact")
public String contact(){
    return "Contact us";
}

}
