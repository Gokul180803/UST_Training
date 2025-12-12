package com.ust.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

public class Passport {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id ;
    private String passportName;
    @OneToOne
    @JoinColumn(name="pid")

    private Person person;

    public Passport(Integer id, String passportName, Person person) {
        this.id = id;
        this.passportName = passportName;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassportName() {
        return passportName;
    }

    public void setPassportName(String passportName) {
        this.passportName = passportName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
