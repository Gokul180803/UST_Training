package com.ust.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.ust.demo.service.AllService;

@RestController
@RequestMapping
public class Allcontroller {
    
@Autowired
    private AllService as;

@PostMapping("/createStudent")
public Student createStudent(@RequestBody Student student){
    return as.createStudent(student);

}
@PostMapping("/createCourse")
public Course createCourse(@RequestBody Course course){
    return as.createCourse(course);

}
    @GetMapping("/StudentsList")
    public List<Student> studentList(){
        return as.findAllStudent();
    }
@GetMapping("/CourseList")
public List<Course> CourseList(){
    return as.findAllCourse();
}


@PutMapping("/enroll/{id}/{cid}")
public Course enroll(@PathVariable Long id,@PathVariable Long cid){
     return  as.enroll(id, cid);

}
@DeleteMapping("/deleteCourse/{cid}")
public String deleteCourse(@PathVariable Long cid){
    as.DeleteCourse(cid);
     return "course Deleted";

}
@DeleteMapping("/deleteStudent/{id}")
public String deleteStudent(@PathVariable Long id){
as.DeleteStudent(id);
return "Student Deleted";
}

@DeleteMapping("/deleteCoursebyStudentId/{id}/{cid}")
public String DeleteCoursebyStudentID(@PathVariable Long id,@PathVariable Long cid){
         as.DeleteCoursebyStudentID(id, cid);
         return "delete the course";
}



}
