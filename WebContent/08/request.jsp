<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
     <input type="text" name="刘伟"> <input type="submit" value="提交">
</form>
<%=request.getMethod() %>
<% 
  out.print(request.getRequestURI());
out.print("<br>");
out.print(request.getProtocol());
out.print("<br>"); out.print(request.getServletPath());
out.print("<br>"); out.print(request.getServerName());
out.print("<br>"); out.print(request.getServerPort());
out.print("<br>"); out.print(request.getRemotePort());
out.print("<br>"); out.print(request.getRemoteAddr());
out.print("<br>"); out.print(request.getRemoteHost());

%>
</body>
</html>