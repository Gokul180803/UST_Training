package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    
    public Library() {
        books = new ArrayList<>();
    }

  
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

 
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\nLibrary Collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
