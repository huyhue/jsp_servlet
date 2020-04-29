<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Server Page</title>
</head>
<body>
	<h1>Post Parameters</h1>
	<form action="index.php">
		<div>
			HO TEN : <input name="txtFullName"/>
		</div>
		<div>
			LUONG : <input name="txtSalary"/>
		</div>
		<hr/>
		<div>
			<button formmethod="post">TINH LUONG</button>
		</div>
	</form>
</body>
</html>