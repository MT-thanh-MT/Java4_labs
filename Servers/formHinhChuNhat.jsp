<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="chuNhatServlet" method="post">
	a: <input type="text" name="a" placeholder="Canh a?" /> <br> <br>
	b: <input type="text" name="b" placeholder="Canh b?" /> <br> <br>
	
	<input type="submit" value="Tinh CV DT" />
	
</form>
<hr>
<h2>${ message }</h2>
</body>
</html>