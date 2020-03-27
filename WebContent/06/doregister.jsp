<%@page import="com.coffee.entity.UserEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 普通玩法 -->
<%
/*
String uString=request.getParameter("username");
String pString=request.getParameter("password");
out.print(uString);
out.print("<br>");
out.print(pString);
*/
%>
<!-- usebean普通玩法 -->
<jsp:useBean id="userEntity"  scope="page" class="com.coffee.entity.UserEntity"/>
<jsp:setProperty property="*" name="userEntity"/>
<jsp:getProperty property="username" name="userEntity"/>
<jsp:getProperty property="password" name="userEntity"/>
<%
out.print("userEntity:"+userEntity.getUsername());
%>
<!-- bean处理 -->
<%
String uString=request.getParameter("username");
String pString=request.getParameter("password");
UserEntity user=new UserEntity();
user.setUsername(uString);
user.setPassword(pString);
out.print("ustring:"+user.getUsername());
out.print("pstring:"+user.getPassword());
%>
</body>
</html>