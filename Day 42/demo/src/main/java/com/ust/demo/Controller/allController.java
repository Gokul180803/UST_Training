package com.ust.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.Service.allService;
import com.ust.demo.entity.Author;
import com.ust.demo.entity.Book;

@RestController
@RequestMapping
public class allController {
    @Autowired
    private allService as;

@PostMapping("/createAuthor")
public Author createAuthor(@RequestBody Author author){
    
    return as.createAuthor(author);
}

// @PostMapping("/createBook")
// public Book createBook(@RequestBody Book book){
    
//     return as.createBook(book);
// }

@GetMapping("/authorList")
public List<Author> findAllAuthor(){
    return as.findAllAuthor();
}
@GetMapping("/bookList")
public List<Book> findAllBook(){
    return as.findAllBook();
}


@GetMapping("/findAuthorByid/{id}")
public Optional<Author> findAuthorbyid(@PathVariable Long id){
    return as.findAuthorbyid(id);

}

@GetMapping("/findBookbyid/{id}")
public  Optional<Book> findBookbyid(@PathVariable Long id){
    return as.findBookbyid(id);
}


@DeleteMapping("/deleteAuthor/{id}")
public String deleteAuthor(@PathVariable Long id){
    as.deleteAuthor(id);
    return "author is Removed";

}
@DeleteMapping("/deleteBook/{id}")
public String deleteBook(@PathVariable Long id){
    as.deleteBook(id);
    return "Book is Deleted";
}

@PutMapping("/updateAuthor/{id}/{idBook}")
public Author updateAuthor(@PathVariable Long id,@PathVariable Long idBook){
    return as.updateAuthor(id,idBook);
}
@GetMapping("/orderby/{id}")
public List<Book> orderby(@PathVariable Long id){
    return as.orderByYear(id);
}
}