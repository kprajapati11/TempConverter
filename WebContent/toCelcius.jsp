<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the temperature converter page!</title>
</head>
<body>
<h1> Fahrenheit to Celcius Converter Page!</h1>
<form action="getCelciusServlet" method="post">
Enter temperature in Fahrenheit : 
<input type="text" name="userFarh" size="10">
<input type="submit" value="Calculate Temperature"/>
</form>
<br><br><br><br><br><br>
<a href="index.jsp"> Convert from Celcius to Fahrenheit</a>
</body>
</html>