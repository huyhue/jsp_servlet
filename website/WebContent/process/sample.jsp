<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	This is sample.<br/>
	This is Blog <%= config.getInitParameter("blog") %> <br/>
	<%
		out.print("Hello World </br>");
	 	int i = 8;
	 	ArrayList list;
	%>
	Value of i: <%= i %>
	<%@ include file="/common/header.jsp" %>
	
	<%!
		String name = "Jerry";
	%>
	<jsp:include page="/common/header.jsp">
		<jsp:param value="<%= name %>" name="catName"/>
	</jsp:include>
</body>
</html>