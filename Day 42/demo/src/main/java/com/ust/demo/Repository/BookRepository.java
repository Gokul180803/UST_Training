package com.ust.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
