package com.entity;

import java.util.List;

public class order {

	long pk;
	String oid;
	long price;
	List<product> products;
	customer owner;
	String remark;
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getPk() {
		return pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public List<product> getProducts() {
		return products;
	}

	public void setProducts(List<product> products) {
		this.products = products;
	}

	public customer getOwner() {
		return owner;
	}

	public void setOwner(customer owner) {
		this.owner = owner;
	}

}
