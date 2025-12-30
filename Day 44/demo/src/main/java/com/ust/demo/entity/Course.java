package com.ust.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
@Id
@GeneratedValue
private Long CourseID;
private String CourseName;
private String Duration;


@ManyToMany
@JoinTable(name="Student_Course",
joinColumns=@JoinColumn(name="CourseID"),
inverseJoinColumns=@JoinColumn(name="StudentID"))
@JsonIgnore
List<Student> students;
public Course(){}
    public Course(String CourseName, String Duration, List<Student> students) {
        this.CourseName = CourseName;
        this.Duration = Duration;
        this.students = students;
    }

    public Course(Long courseID, String courseName, String duration, List<Student> students) {
       this. CourseID = courseID;
          this.CourseName = courseName;
        this.  Duration = duration;
        this.students = students;
    }

    public Long getCourseID() {
        return CourseID;
    }

    public void setCourseID(Long courseID) {
        CourseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }




}
