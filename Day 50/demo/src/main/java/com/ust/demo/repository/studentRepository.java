package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Student;
@Repository
public interface studentRepository extends JpaRepository<Student, Long> {

}
