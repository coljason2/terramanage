package com.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicAction {
	Logger logger = LoggerFactory.getLogger(BasicAction.class);

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/AddCustomer")
	public String AddCustomer() {
		return "/customer/addCustomer";
	}

	@RequestMapping(value = "/AddOrder")
	public String AddOrder() {
		return "/order/addOrder";
	}

	@RequestMapping(value = "/AddProduct")
	public String AddProduct() {
		return "/product/addProduct";
	}

	@RequestMapping(value = "/AddShoes")
	public String AddShoes() {

		return "/product/addShoes";
	}

	@RequestMapping(value = "/DetailCustomer")
	public String DetailCustomer() {
		return "/detail/dCustomer";
	}

	@RequestMapping(value = "/DetailOrder")
	public String DetailOrder() {
		return "/detail/dProduct";
	}

	@RequestMapping(value = "/ManageCustomer")
	public String ManageCustomer() {
		return "/customer/mCust";
	}

	@RequestMapping(value = "/ManageOrder")
	public String ManageOrder() {
		return "/order/mOrder";
	}

	@RequestMapping(value = "/ManageProduct")
	public String ManageProduct() {
		return "/product/mProduct";
	}

	@RequestMapping(value = "/about")
	public String aboutterra() {
		logger.debug("--------------------");
		return "/about";
	}

	@RequestMapping(value = "/test")
	public String actiontest() {
		return "indextest";
	}
}
