package com.ust.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Course {
@Id
@GeneratedValue
    private Long courseID;
    private String courseName;

@ManyToOne
@JoinColumn
@JsonIgnore
    private Student student;

public Course() {
}

public Course(Long courseID, String courseName, Student student) {
    this.courseID = courseID;
    this.courseName = courseName;
    this.student = student;
}

public Long getCourseID() {
    return courseID;
}

public void setCourseID(Long courseID) {
    this.courseID = courseID;
}

public String getCourseName() {
    return courseName;
}

public void setCourseName(String courseName) {
    this.courseName = courseName;
}

public Student getStudent() {
    return student;
}

public void setStudent(Student student) {
    this.student = student;
}

    
}
