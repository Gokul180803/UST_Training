package com.library.app;

import com.library.model.Book;
import com.library.service.Library;

public class Main {
    public static void main(String[] args) {
        // Create Library instance
        Library library = new Library();

        // Create Book objects
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        library.displayAllBooks();
    }
}
