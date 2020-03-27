package com.coffee.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Parameter")
public class ParameterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	public ParameterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Map<String, String[]> map=req.getParameterMap();
		 Iterator<String> keys = map.keySet().iterator();
	   String key=null;
	   String[] values=null;
	    while (keys.hasNext()) {
			key =  keys.next();
			values=map.get(key);
			System.out.println("key:"+key+"values:"+Arrays.toString(values));		
	}
	String uString=map.get("url")[0]    ;
	  //  String uString=req.getParameter("url");
	    req.getRequestDispatcher("/"+uString).forward(req, resp);
	}
}
