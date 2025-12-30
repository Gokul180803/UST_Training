package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Course;
import com.ust.demo.entity.Student;
import com.ust.demo.repository.courseRepository;
import com.ust.demo.repository.studentRepository;

@Service
public class Allservice {
@Autowired
private courseRepository cr;
@Autowired
private studentRepository sr;

public Student createStudent(Student student){
       return  sr.save(student);
}
public Course createCourse(Course course){
    return cr.save(course);
}
public List<Student> findAllStudent(){
    return sr.findAll(); 
}
public List<Course> findAllCourse(){
    return cr.findAll();
}
public Optional<Student> findByStudentID(Long id){
    return sr.findById(id);
}
public Optional<Course> findByCourseID(Long id){
     return  cr.findById(id);
}
public void DeleteStudent(Long id){
    sr.deleteById(id);
}
public void DeleteCourse(Long id){
    cr.deleteById(id);
}

public Student enroll(Long id ,Long Cid){
Student s=sr.findById(id).orElse(null);
Course c= cr.findById(Cid).orElseThrow();

c.setStudent(s);
return sr.save(s); 

}
}
