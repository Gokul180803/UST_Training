package com.ust.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Author;
@Repository
public interface authorRepository extends JpaRepository<Author, Long> {
@Query("Select b from Book b  ORDER BY b.publication_year DESC")
List<Author> orderByYear(Long id);
}
