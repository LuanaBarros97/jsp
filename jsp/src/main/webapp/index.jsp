<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Projeto em JSP</h1>
	<form action="ServLetLogin" method="post">
	
	<table>
		<tr>
		<td><label>Login:</label></td>
		<td><input name="Login" type="text"></td>
		</tr>

		<tr>
		<td><label>Senha:</label></td>
		<td><input name="Senha" type="password"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="Enviar"></td>
	
	
	</table>
	</form>
</body>
</html>