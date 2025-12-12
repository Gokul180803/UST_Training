package com.ust.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Did;
    private String name;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="department_table")
    private Employee employee;

    public Department(Long Did, Employee employee, String name) {
        this.Did = Did;
        this.employee = employee;
        this.name = name;
    }

    public Long getDid() {
        return Did;
    }

    public void setDid(Long Did) {
        this.Did = Did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
