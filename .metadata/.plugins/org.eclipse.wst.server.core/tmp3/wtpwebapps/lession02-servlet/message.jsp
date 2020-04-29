<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Server Page</title>
</head>
<body>
	<h1>
		${myMSG }
	</h1>
	<a href="message.html">Go to Message HTML !</a>
	<form action="message.html" method="get">
		<label>Name : </label>
		<input type="text" name="txtName">
		<button type="submit">Submit Form</button>
	</form>
</body>
</html>