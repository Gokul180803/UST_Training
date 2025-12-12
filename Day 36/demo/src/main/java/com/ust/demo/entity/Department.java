package com.ust.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer did;
    private String name;
    @ManyToOne
    @JoinColumn(name="employee_id")
    @JsonBackReference
    private Employee employees;

}
