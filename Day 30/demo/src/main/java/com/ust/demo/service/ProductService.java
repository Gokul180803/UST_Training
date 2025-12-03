package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Product;
import com.ust.demo.repository.ProductRespository;

@Service
public class ProductService {
    @Autowired
private ProductRespository ps;


public Product create(Product product){
  return ps.save(product);
}
public List<Product> read(){
    return ps.findAll();

}
public Optional<Product> read(Integer id){
return ps.findById(id);
}

public Product update(Product product){
return ps.save(product);
}


public void delete(Integer id){
    ps.deleteById(id);
}
}
