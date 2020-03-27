package com.coffee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/Second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name1=(String) request.getServletContext().getAttribute("name1");
//		String session_name1=(String) request.getSession().getAttribute("session_name1");
//		response.getWriter().append(name1+"\n"+session_name1);
		
		
//		  Cookie[] cookies=request.getCookies();
//		  for(Cookie cookie:cookies)
//		  {  
//		 	response.getWriter().print(cookie.getName()+":"+cookie.getValue()
//		 +"<br>");
//		  }
		
		String name= request.getParameter("name");
		 response.getWriter().append(name+"this is Second page");
	}

}
