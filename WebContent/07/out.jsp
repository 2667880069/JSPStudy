<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" autoFlush="true" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print(out.isAutoFlush());
out.print("缓冲区大小："+out.getBufferSize());
out.print("缓冲区剩余："+out.getRemaining());
out.flush();
//out.clear();
out.clearBuffer();
out.print("缓冲区剩余："+out.getRemaining());
%>
</body>
</html>