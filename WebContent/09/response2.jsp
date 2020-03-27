<%@page import="java.net.URLEncoder"%>
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
Cookie myCookie=new Cookie("coffee",URLEncoder.encode("刘伟"));
myCookie.setMaxAge(3600);
myCookie.setPath("/");//放在根目录下可以共用
response.addCookie(myCookie);
request.setAttribute("liuname", "hahaha");
request.setAttribute("liuskills", "llllllll");
//response.sendRedirect("result.jsp");
%>
<jsp:forward page="result.jsp"></jsp:forward> 
</body>
</html>