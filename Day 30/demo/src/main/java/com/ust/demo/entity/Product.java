package com.ust.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	
		private Integer id;
     private String name;
     private String catagory;
     private Double price;
        Product(){}
        
		public Product(Integer id, String name, String catagory, Double price) {
			super();
			this.id = id;
			this.name = name;
			this.catagory = catagory;
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
		public String getCatagory() {
			return catagory;
		}
		public void setCatagory(String catagory) {
			this.catagory = catagory;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", catagory=" + catagory + ", price=" + price + "]";
		}
        
}
