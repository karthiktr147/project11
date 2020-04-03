package com.mindtree.brand.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Brand {
	@Id
	@GeneratedValue
	private int id ;
	@NotNull
	private String brandName;
	@NotNull
	private int noOfProducts;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(@NotNull String brandName, @NotNull int noOfProducts) {
		super();
		this.brandName = brandName;
		this.noOfProducts = noOfProducts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", brandName=" + brandName + ", noOfProducts=" + noOfProducts + "]";
	}
	

}
