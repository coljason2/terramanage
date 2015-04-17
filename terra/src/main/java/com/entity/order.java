package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class order {
	String pkid;
	customer owner;
	List<product> products;

	public String getPkid() {
		return pkid;
	}

	public void setPkid(String pkid) {
		this.pkid = pkid;
	}

	public customer getOwner() {
		return owner;
	}

	public void setOwner(customer owner) {
		this.owner = owner;
	}

	public List<product> getProducts() {
		return products;
	}

	public void setProducts(List<product> products) {
		this.products = products;
	}

}
