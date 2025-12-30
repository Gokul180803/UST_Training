package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
