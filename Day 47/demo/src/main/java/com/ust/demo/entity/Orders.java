package com.ust.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
@Id
@GeneratedValue
private Long orderID;
@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
List<Product> products;


    public Orders() {
    }

    public Orders(List<Product> products) {
        this.products = products;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
