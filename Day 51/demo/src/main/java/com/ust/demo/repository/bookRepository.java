package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Book;
@Repository
public interface bookRepository extends JpaRepository<Book, Long>{

}
