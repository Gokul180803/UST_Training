package com.ust.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity

public class Student {

@Id
@GeneratedValue
private Long StudentId;
private String StudentName;
 @ManyToMany(mappedBy="students",cascade=CascadeType.ALL)

 List<Course> courses;
 public Student(){}

    public Student(Long StudentId, String StudentName, List<Course> courses) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.courses = courses;
    }

    public Student(String StudentName, List<Course> courses) {
        this.StudentName = StudentName;
        this.courses = courses;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }




}
