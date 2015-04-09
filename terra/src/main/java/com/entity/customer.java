package com.entity;

import java.util.List;

public class customer {

	long pk;
	String name;
	String id;
	String phone;
	String area;
	String addr;
	String phoneowner;
	String remark;

	public String getPhoneowner() {
		return phoneowner;
	}

	public void setPhoneowner(String phoneowner) {
		this.phoneowner = phoneowner;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	List<order> orders;

	public long getPk() {
		return pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public List<order> getOrders() {
		return orders;
	}

	public void setOrders(List<order> orders) {
		this.orders = orders;
	}

}
