package com.ust.demo1.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String category;
    private double price;

    public ProductEntity() {
    }

    public ProductEntity( Integer id, String name,String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductEntity [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }

  

}
