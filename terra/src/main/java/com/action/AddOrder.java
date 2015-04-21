package com.action;



import com.basic.BasicAction;

/**
 * Servlet implementation class AddOrder
 */
public class AddOrder extends BasicAction {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddOrder() {
		super();
		setPath("/pages/order/addOrder.jsp");
	}
}
