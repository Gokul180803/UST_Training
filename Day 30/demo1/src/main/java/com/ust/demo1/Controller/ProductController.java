package com.ust.demo1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo1.Product.ProductEntity;
import com.ust.demo1.ProductService.ProductService;

@RestController
@RequestMapping("/product1")
public class ProductController {
@Autowired
ProductService ps;


@PostMapping
public ProductEntity add(@RequestBody ProductEntity product){
    return ps.create(product);
}
@GetMapping
public List<ProductEntity> read(){
    return ps.read();
}
@GetMapping("/{id}")
public ProductEntity findById(@PathVariable("id")Integer id){
Optional<ProductEntity> op=ps.read(id);
if(op.isPresent()){
    return op.get();
}
return null;

}
@PostMapping("/{id}")
public ProductEntity update(@PathVariable("id") Integer id,@RequestBody ProductEntity product){
     return ps.update(product);
}
@DeleteMapping("/{id}")
public void delete(@PathVariable("id") Integer id){

   ps.delete(id);

}





}
