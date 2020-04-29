<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/common/header.jsp">
		<jsp:param value="Tom" name="catName"/>
	</jsp:include>
	
	The image name is: <%= request.getAttribute("imageName") %>
	<img alt="This is a show" src="image/funny.jpg">
	
	<%@ include file="/common/header.jsp" %>
</body>
</html>