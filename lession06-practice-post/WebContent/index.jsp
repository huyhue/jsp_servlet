<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<form action="index.html">
		<div>
			<label>CHIEU DAI: </label>
			<input type="number" name="txtChieuDai" value="${ d }"/>
		</div>
		<div>
			<label>CHIEU RONG: </label>
			<input type="number" name="txtChieuRong" value="${ r }"/>
		</div>
		<div>
			<button formmethod="post">TINH</button>
		</div>
	</form>
	<h2>CHU VI : ${ cv }</h2>
	<h2>DIEN TICH : ${ dt }</h2>
</body>
</html>