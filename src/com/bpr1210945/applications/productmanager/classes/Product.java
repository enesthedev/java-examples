package com.bpr1210945.applications.productmanager.classes;

import java.util.ArrayList;
import java.util.UUID;

public class Product {
	UUID uuid;
	String name;
	Double price;
	Category category;
	
	public Product() {
		this.uuid = UUID.randomUUID();
	}
	
	public Product setName(String productName) {
		if (productName.length() == 0) {
			throw new RuntimeException("productName length must be longer then 0");
		}
		this.name = productName;
		return this;
	}
	
	public Product setPrice(Double productPrice) {
		this.price = productPrice;
		return this;
	}

	public Product setCategory(Category productCategory) {
		if (this.hasCategory()) {
			this.category.removeProduct(this);
		}
		this.category = productCategory;
		this.category.addProduct(this);
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public UUID getId() {
		return this.uuid;
	}
	
	public Boolean hasCategory() {
		return !(this.category == null);
	}
	
	public ArrayList<Object> getInfo() {
		ArrayList<Object> product = new ArrayList<Object>();
		
		product.add(this.uuid);
		product.add(this.name);
		product.add(this.price);
		product.add(this.category);
		
		return product;
	}

}
