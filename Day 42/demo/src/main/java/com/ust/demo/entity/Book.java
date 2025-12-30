package com.ust.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
@Id
private Long book_id;
private String name;
private Long publication_year;
@ManyToOne
@JoinColumn
@JsonBackReference
private Author author;
      public Book(){}
    public Book(Author author, Long book_id, String name, Long publication_year) {
        this.author = author;
        this.book_id = book_id;
        this.name = name;
        this.publication_year = publication_year;
    }

    public Book(Author author, String name, Long publication_year) {
        this.author = author;
        this.name = name;
        this.publication_year = publication_year;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }



}
