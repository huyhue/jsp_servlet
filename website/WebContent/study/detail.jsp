<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="student" class="ducky.models.Student">
		<jsp:setProperty property="name" name="student" param="region"/>
	</jsp:useBean>
	Get Property name: <jsp:getProperty property="name" name="student"/>
	
	<br>
	Student name: <%= request.getParameter("name") %>     ${param.name }
	<br>
	Region: <%= request.getParameter("region") %>   ${param.region }
</body>
</html>