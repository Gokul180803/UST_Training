package com.ust.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;



    @OneToMany(mappedBy="author",cascade=CascadeType.ALL,orphanRemoval=true)
    @JsonManagedReference
    List<Book> books;
    public Author(){}

    public Author(List<Book> books, Long id, String name) {
        this.books = books;
        this.id = id;
        this.name = name;
    }

    public Author(List<Book> books, String name) {
        this.books = books;
        this.name = name;
     
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

   
   
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }




}
