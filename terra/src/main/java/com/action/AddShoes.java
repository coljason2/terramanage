package com.action;



import com.basic.BasicAction;

/**
 * Servlet implementation class AddShoes
 */
public class AddShoes extends BasicAction {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddShoes() {
		super();
		setPath("/pages/product/addShoes.jsp");
	}
}
