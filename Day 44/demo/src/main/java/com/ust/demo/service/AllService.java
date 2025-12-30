package com.ust.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Course;
import com.ust.demo.entity.Student;
import com.ust.demo.repository.CourseRepository;
import com.ust.demo.repository.StudentRepository;

@Service
public class AllService {
    @Autowired
    private StudentRepository sr;
    @Autowired
    private CourseRepository cr;


    public Course createCourse(Course course){
        return cr.save(course);

    }
      public Student createStudent(Student student){
        return sr.save(student);

    }
     
public Course enroll(Long id,Long cid){
    Student s=sr.findById(id).orElseThrow();
    Course c=cr.findById(cid).orElseThrow();
      c.getStudents().add(s);


     return  cr.save(c);
}
public List<Course> findAllCourse(){
    return cr.findAll();
}
public List<Student> findAllStudent(){
    return sr.findAll();
}
public void DeleteCourse(Long cid){
    cr.deleteById(cid);
  

}
public void DeleteStudent(Long id){
    sr.deleteById(id);
   

}
public void DeleteCoursebyStudentID(Long id,Long cid){
    Student s=sr.findById(id).orElseThrow();
    Course c=cr.findById(cid).orElseThrow();
  // s.getCourses().remove(c);
  c.getStudents().remove(s);
    sr.save(s);


}
}
