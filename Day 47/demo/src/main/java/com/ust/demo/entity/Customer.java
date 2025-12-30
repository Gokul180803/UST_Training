package com.ust.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Customer {
 @Id
      @GeneratedValue
      private Long CustomerID;
      private String name;

      @OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
      List<Product> products;

    public Customer(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Customer() {
    }

    public Long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Long CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
