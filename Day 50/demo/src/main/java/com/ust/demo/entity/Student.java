package com.ust.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity

public class Student {
@Id
@GeneratedValue
    private Long id;
    private String name;
@OneToMany(mappedBy="student",cascade=CascadeType.ALL)
    List<Course> courses;


    
public Student() {
}



public Student(Long id, String name, List<Course> courses) {
    this.id = id;
    this.name = name;
    this.courses = courses;
}



public Long getId() {
    return id;
}



public void setId(Long id) {
    this.id = id;
}



public String getName() {
    return name;
}



public void setName(String name) {
    this.name = name;
}



public List<Course> getCourses() {
    return courses;
}



public void setCourses(List<Course> courses) {
    this.courses = courses;
}
    

}
