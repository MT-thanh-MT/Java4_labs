<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tam Giác</title>
</head>
<body>
<form action="TamGiacServlet" method="post">
	a: <input type="text" name="a" placeholder="Cạnh a?" required /> <br> <br>
	b: <input type="text" name="b" placeholder="Cạnh b?" required /> <br> <br>
	c: <input type="text" name="c" placeholder="Cạnh c?" required /> <br> <br>
	
	<input type="submit"  formaction="chuvi" value="Tính Chu Vi" />
	<input type="submit"  formaction="dientich" value="Tính Diện Tích" />
	
</form>
<hr>
<h2>${ message }</h2>
</body>
</html>