<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=application.getServerInfo() %>
<%=application.getServletContextName() %>
<%
Object object=application.getAttribute("count");
 if(object==null){
	 application.setAttribute("count", new Integer(1));
	 out.print("1次！<br>"); 
 }else{
	 int cou=Integer.parseInt(object.toString());
	 out.print("访问了"+cou+"次");
	 cou++;
	 application.setAttribute("count", cou);
 }

%>
</body>
</html>