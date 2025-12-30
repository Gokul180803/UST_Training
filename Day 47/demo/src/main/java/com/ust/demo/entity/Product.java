package com.ust.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
     @Id
     @GeneratedValue
     private Long productID;
     private String name;
     private String categories;
@ManyToOne
@JoinColumn
private Customer customer;
@ManyToOne
@JoinColumn
private Orders order;
    public Product() {
    }

    public Product(String categories, Customer customer, String name, Orders order) {
        this.categories = categories;
        this.customer = customer;
        this.name = name;
        this.order = order;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

}
