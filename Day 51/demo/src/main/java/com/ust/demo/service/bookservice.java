package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Book;
import com.ust.demo.repository.bookRepository;

@Service
public class bookservice {
@Autowired
private bookRepository br;

public Book createBook(Book book){
    return br.save(book);
}

public List<Book> FindBook(){
return br.findAll();
}

public Optional<Book> FindBookByID(Long id){
    return br.findById(id);

}

public void DeleteBook(Long id){
     br.deleteById(id);
}




}
