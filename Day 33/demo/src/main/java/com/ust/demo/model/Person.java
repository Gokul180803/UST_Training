package com.ust.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private String name;
@OneToOne(mappedBy="person")
    private Passport passport;

    public Person(Integer id, String name, Passport passport) {
        this.id = id;
        this.name = name;
        this.passport = passport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

   

    

}
