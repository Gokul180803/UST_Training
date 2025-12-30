package com.ust.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Customer;
import com.ust.demo.entity.Orders;
import com.ust.demo.entity.Product;
import com.ust.demo.repository.CustomerRepository;
import com.ust.demo.repository.OrderRepository;
import com.ust.demo.repository.ProductRepository;

@Service
public class AllService {
    @Autowired
    private CustomerRepository cr;
    @Autowired
    private OrderRepository or;

    @Autowired
    private ProductRepository pr;

    public Customer CreateCustomer(Customer customer){
        return cr.save(customer);
    }
    public Product CreateProduct(Product product){
        return pr.save(product);
    }
     public Orders CreateOrder(Orders order){
        return or.save(order);
    } 
    

    public List<Customer> FindAllCustomer(){
        return cr.findAll();

    }
      public List<Product> FindAllProduct(){
        return pr.findAll();
        
    }
      public List<Orders> FindAllOrder(){
        return or.findAll();
        
    }


    public void addproductTocustomer(Long productID,Long CustomerID,Long orderID){
        Product p=pr.findById(productID).orElseThrow();
        Customer c=cr.findById(CustomerID).orElseThrow();
        Orders o= or.findById(orderID).orElseThrow();
         p.setCustomer(c);
         p.setOrder(o);
       //  return or.save(o);

    }

}
