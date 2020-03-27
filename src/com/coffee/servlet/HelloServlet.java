package com.coffee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service start");
	  response.getWriter().append("<b>Hello Servlet<b>");
	  response.getWriter().close();
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
		super.init();
	}

}
