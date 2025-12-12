package com.ust.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Course;
import com.ust.demo.entity.Student;
import com.ust.demo.service.Allservice;

@RestController
@RequestMapping("/control")
public class AllController {
@Autowired
private Allservice as;
@PostMapping("/createStudent")
public Student createStudent(@RequestBody Student student){
    return as.createStudent(student);

}
@PostMapping("/createCourse")
public Course createCourse (@RequestBody Course course){
    return as.createCourse(course);
}

@GetMapping("/details/{CID}/{SID}")
public Student disp(@PathVariable Integer CID, @PathVariable Integer SID){
    return as.enrolled(CID, SID);
}



}
