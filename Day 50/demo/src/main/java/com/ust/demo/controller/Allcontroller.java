package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Course;
import com.ust.demo.entity.Student;
import com.ust.demo.service.Allservice;

@RestController
@RequestMapping
public class Allcontroller {

@Autowired
    private Allservice as;

@PostMapping("/addStudent")
    public Student createStudent(@RequestBody Student student){
      return   as.createStudent(student);
    }
    @PostMapping("/addCourse")
      public Course createCourse(@RequestBody Course course){
        return as.createCourse(course);
      }
      @GetMapping("/studentList")
      @PreAuthorize("hasRole('ADMIN')")
      public List<Student> findAllStudent(){
          return as.findAllStudent();
        }
        @GetMapping("/courseList")
        public List<Course> findAllCourse(){
          return as.findAllCourse();
          }
          @GetMapping("/studentList/{id}")
      public Optional<Student> findByStudentID(@PathVariable Long id){
       return  as.findByStudentID(id);
      }
      @GetMapping("/courseList/{id}")
      public Optional<Course> findByCourseID(@PathVariable Long id){
       return as.findByCourseID(id);
      }
      @DeleteMapping("/deleteStudent/{id}")
      public String DeleteStudent(@PathVariable Long id){
        as.DeleteStudent(id);
        return "Student deleted";
      }
      @DeleteMapping("/deleteCourse/{id}")
      public void DeleteCourse(@PathVariable Long id){
        as.DeleteCourse(id);
      }
@PutMapping("/enroll/{id}/{Cid}")
public Student enroll(@PathVariable Long id ,@PathVariable Long Cid){
  return as.enroll(id, Cid);

}

}
