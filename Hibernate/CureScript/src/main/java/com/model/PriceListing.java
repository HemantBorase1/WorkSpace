package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PriceListing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private boolean isStock;
	private String lastUpdated;
	
	@ManyToOne
	Medicine medicine=new Medicine();
	
	@ManyToOne
	Pharmacy pharmacy=new Pharmacy();
	
	@Override
	public String toString() {
		return "PriceListing [id=" + id + ", name=" + name + ", price=" + price + ", isStock=" + isStock
				+ ", lastUpdated=" + lastUpdated + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isStock() {
		return isStock;
	}
	public void setStock(boolean isStock) {
		this.isStock = isStock;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
