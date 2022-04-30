<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "addAgenda">
		<label for="id">ID:</label>
		<input id="id" type="text" name = "aid"><br>
		<label for="atelPessoal">Tel Pessoal:</label>
		<input id="atelPessoal" type="text" name = "atelPessoal"><br>
		<label for="atelComercial">Tel Comercial:</label>
		<input id="atelComercial" type="text" name = "atelComercial"><br>
		<label for="atelOutro">Tel Outro:</label>
		<input id="atelOutro" type="text" name = "atelOutro"><br>
		<label for="aemail">Email:</label>
		<input id="aemail" type="text" name = "aemail"><br>
		<label for="anome">Nome:</label>
		<input id="anome" type="text" name = "anome"><br>
		<input type="submit"><br>
	</form>
	
	<form action = "getAgenda">
		<input type="text" name = "aid"><br>
		<input type="submit"><br>
	</form>
</body>
</html>