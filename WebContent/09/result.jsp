
<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.tomcat.util.http.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   Cookie[] cookies=request.getCookies();
 for(Cookie cookie:cookies)
 {  
	 out.print(cookie.getName()+":"+URLDecoder.decode(cookie.getValue())
+"<br>");
 }
%>
<%=request.getAttribute("liuname") %> <%=request.getParameter("liuskills") %> 

</body>
</html>