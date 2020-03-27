<%@page import="java.nio.channels.SeekableByteChannel"%>
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
  if(session.getAttribute("userid")!=""){
%>
 你好：<%=session.getAttribute("userid") %>
 <a href="sessionlogout.jsp">注销</a>
 <%
  }else{
 %>
 请登录！
 <a href="sessionlogin.jsp">登录</a>
<%
  }
%>
<%if(session.isNew()){ 

%>
 新用户你好
<%}else{ 
	out.print("laoyonghunihao!");
%>
老用户你好
<%} %>
</body>
</html>