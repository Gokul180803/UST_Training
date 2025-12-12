package com.ust.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
private double salary;

@OneToMany(mappedBy="employee")
List<Department>  department;

    public Employee( Long id, String name, double salary,List<Department> department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

}