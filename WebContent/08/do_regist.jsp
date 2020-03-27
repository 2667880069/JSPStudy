<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%request.setCharacterEncoding("UTF-8"); %>
<!-- 服务器端没有setParameter -->
<%
 String usnString=request.getParameter("userName");
String skills="";
String[] sk= request.getParameterValues("skills");
 for(String skill:sk){
	 skills+=skill+"&nbsp;";
 }
 //out.print(skills);
 request.setAttribute("liuname", usnString);
 request.setAttribute("liuskills", skills);
%>
<jsp:forward page="requestlast.jsp"></jsp:forward> 

