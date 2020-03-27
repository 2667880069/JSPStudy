package com.coffee.servlet;

import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
//	String name= request.getParameter("name");
//	String age=request.getParameter("age");
//	Enumeration<String> names=request.getParameterNames();
//	String parametername=null;
//	while (names.hasMoreElements()) {
//		parametername = (String) names.nextElement();
//		System.out.println("name名字："+parametername);	
//	}
//	String[] languages=request.getParameterValues("language");
//	System.out.println("语言："+Arrays.toString(languages));
//	
//    Map<String, String[]> map=	request.getParameterMap();
//    System.out.println(map);
//    //key value
//    /**
//     * name 
//     * age
//     * language
//     */
//   Iterator<String> keys = map.keySet().iterator();
//   String key=null;
//   String[] values=null;
//    while (keys.hasNext()) {
//		key =  keys.next();
//		values=map.get(key);
//		System.out.println("values:"+Arrays.toString(values));
//}
//  request.getServletContext().setAttribute("name1", "liuwei");
//  request.getSession().setAttribute("session_name1", "session_liuwei");
//// 
////		Cookie cookie=new Cookie("name", "liuwei");
////		response.addCookie(cookie);
//  
//		
//		 request.getRequestDispatcher("/Second").forward(request, response);
//		 response.sendRedirect("http://www.baidu.com");
		String name=new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8") ;
		 response.getWriter().append(name+"this is First page");
	}

}
