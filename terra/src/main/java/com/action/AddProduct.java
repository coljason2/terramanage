package com.action;

import com.basic.BasicAction;

public class AddProduct extends BasicAction {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProduct() {
		super();
		setPath("/pages/product/addProduct.jsp");
	}
}
