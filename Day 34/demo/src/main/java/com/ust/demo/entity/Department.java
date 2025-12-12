package com.ust.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Did;
    private String name;
    @ManyToOne
    @JoinColumn(name="department_table",nullable=false)
    private Employee employee;

}
