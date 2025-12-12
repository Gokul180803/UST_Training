
package com.ust.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Course;
import com.ust.demo.entity.Student;
import com.ust.demo.repository.CourseRepository;
import com.ust.demo.repository.StudentRepository;

@Service
public class Allservice {
@Autowired
private CourseRepository cr;
@Autowired
private StudentRepository sr;
       

public Student createStudent(Student student){
    
    return sr.save(student);

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




public Student enrolled(Integer CID, Integer SID){
    Student student=sr.findById(SID).orElse(null);
  Course course=cr.findById(CID).orElse(null);
       student.getCourses().add(course);
       course.getStudents().add(student);
       return sr.save(student);

}




}
