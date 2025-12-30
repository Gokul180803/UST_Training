package com.ust.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.Repository.BookRepository;
import com.ust.demo.Repository.authorRepository;
import com.ust.demo.entity.Author;
import com.ust.demo.entity.Book;

@Service
public class allService {
    @Autowired
    private authorRepository ar;
    @Autowired
    private BookRepository br;

public Book createBook(Book book){
return br.save(book);
}
public Author createAuthor(Author author){
return ar.save(author);
}
public List<Book> findAllBook(){
    return br.findAll();
}
public List<Author> findAllAuthor(){
    return ar.findAll();
}
public Optional<Book> findBookbyid(Long id){
    return br.findById(id);

}
public Optional<Author> findAuthorbyid(Long id){
    return ar.findById(id);
}
public Book updateBook(Book book,Long id){
   Optional<Book> op=br.findById(id);
   if(op.isPresent()){
    return br.save(book);

   }
   return null;

}
public Author updateAuthor(Long id,Long idBook){
   
   Author a = ar.findById(id).orElseThrow();
   Book book = br.findById(idBook).orElseThrow();
    
    a.getBooks().remove(book);
    return ar.save(a);
   }


public void deleteBook(Long id){
    br.deleteById(id);
}
public void deleteAuthor(Long id){
    ar.deleteById(id);
}

public List<Book> orderByYear(Long id){
    return br.orderByYear(id);

}






}
