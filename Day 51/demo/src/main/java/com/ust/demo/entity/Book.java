package com.ust.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue
private Long S_id;
private String name;
private Long publication_year;
private String isbn;

    public Book() {
    }

    public Book(Long S_id, String isbn, String name, Long publication_year) {
        this.S_id = S_id;
        this.isbn = isbn;
        this.name = name;
        this.publication_year = publication_year;
    }

    public Long getS_id() {
        return S_id;
    }

    public void setS_id(Long S_id) {
        this.S_id = S_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(Long publication_year) {
        this.publication_year = publication_year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
