<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   %>
    <%@page import="java.util.LinkedList" %>
    <%@page import="java.util.HashMap" %>
    <%@page import="java.util.ArrayList,java.util.Arrays" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  ArrayList arrayList=new ArrayList();
  arrayList.add(1);arrayList.add(2);
  LinkedList linkedList=new LinkedList();
  linkedList.add(1);linkedList.add(2);
out.println(arrayList);%>
<br>
<%
out.print(linkedList);
%>

</body>
</html>