package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Product;
@Repository
public interface ProductRespository extends JpaRepository<Product, Integer>{

}
