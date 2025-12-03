package com.ust.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Product;
import com.ust.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class Controller {
        @Autowired
        ProductService pr;
        @PostMapping
        public Product addProduct(@RequestBody Product product){
        return   pr.create(product);
        }

        @GetMapping
        public List<Product> retrieveProduct(){
           return  pr.read();

        }
        @GetMapping("/{id}")
        public Product findProductId(@PathVariable("id")Integer id){
       Optional<Product> op = pr.read(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;          

        }


        @PutMapping("/{id}")
        public Product update(@PathVariable("id") Integer id,@RequestBody Product product ){
            return pr.update(product);

        }
        @DeleteMapping("/{id}")
        public String delete(@PathVariable("id") Integer id){
             pr.delete(id);
             return "deleted";

        }
}
