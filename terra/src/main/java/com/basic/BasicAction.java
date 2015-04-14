package com.basic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	String path = "index.jsp";

	public void setPath(String setpath) {
		path = setpath;
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);

		dispatcher.forward(request, response);
	}
}