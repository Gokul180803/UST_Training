package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Book;
import com.ust.demo.service.bookservice;

@RestController
@RequestMapping
public class bookController {
    @Autowired
    private bookservice bs;
@PostMapping("/book")
public Book createBook(@RequestBody Book book){
    return bs.createBook(book);
}
@GetMapping("/booklist")
public List<Book> findAll(){
    return bs.FindBook();
}
@GetMapping("/booklist/{id}")
public Optional<Book> FindBookByID(@PathVariable Long id){
    return bs.FindBookByID(id);
}
@DeleteMapping("/deleteBook/{id}")
public String DeleteBook(@PathVariable Long id){
    bs.DeleteBook(id);
    return "book is deleted";
}
}
