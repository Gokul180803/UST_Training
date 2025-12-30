
package com.ust.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Customer;
import com.ust.demo.entity.Orders;
import com.ust.demo.entity.Product;
import com.ust.demo.service.AllService;

@RequestMapping
@RestController
public class AllController {
    @Autowired
    private AllService as;
@PostMapping("/customer")
public Customer CreateCustomer(@RequestBody Customer customer ){
    return as.CreateCustomer(customer); 
}
@PostMapping("/order")
public Orders CreateOrder(@RequestBody Orders order ){
    return as.CreateOrder(order); 
}
@PostMapping("/product")
public Product CreateProduct(@RequestBody Product product  ){
    return as.CreateProduct(product); 
}
@GetMapping("/customerList")
public List<Customer> CustomerList(){
   return as.FindAllCustomer();
}
@GetMapping("/productList")
public List<Product> ProductList(){
    return as.FindAllProduct();
    
}
@GetMapping("/orderList")
public List<Orders> OrderList(){
    return as.FindAllOrder();
    
}
@PutMapping("/put/{productID}/{CustomerID}/{orderID}")
public void addproductTocustomer(@PathVariable Long productID,@PathVariable Long CustomerID,@PathVariable Long orderID){
   as.addproductTocustomer(productID, CustomerID, orderID);
}







}
