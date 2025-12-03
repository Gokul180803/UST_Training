package com.ust.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo1.Product.ProductEntity;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

 
}
