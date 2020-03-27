<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
id<%=session.getId() %>
<br>
创建时间<%=new Date(session.getCreationTime()).toLocaleString() %><br>
最后访问时间 <%=new Date(session.getLastAccessedTime()).toLocaleString() %><br>

设置失效时间 <%
//session.setMaxInactiveInterval(120);
%><br>
失效时间<%=session.getMaxInactiveInterval() %>
</body>
</html>