package com.ust.demo1.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo1.Product.ProductEntity;
import com.ust.demo1.Repository.ProductRepository;

@Service
public class ProductService {
@Autowired
ProductRepository pr;

public ProductEntity create(ProductEntity product){
  return pr.save(product);
}

public List<ProductEntity> read(){
    return pr.findAll();
}
public Optional<ProductEntity> read(Integer id){
    return pr.findById(id);

}
public ProductEntity update(ProductEntity product){
    return pr.save(product);
}
public void delete(Integer id){
        pr.deleteById(id);
}


}