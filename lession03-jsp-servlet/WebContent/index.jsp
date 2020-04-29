<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${title }</h1>
	<p>
		Ten : ${ name } <br/>
		Tuoi : ${ age } tuoi
	</p>
	<a href="index.html?name=Nguyen&age=20">LAY TEN VA TUOI</a>
	<form action="index.html">
		<input name="name"/>  <br/>
		<input name="age"/>  <br/>
		<button formmethod="get">GUI</button>
	</form>
</body>
</html>