<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the temperature converter page!</title>
</head>
<body>
<h1> Celcius to Fahrenheit Converter Page!</h1>
<form action="getFarenheitServlet" method="post">
Enter temperature in Celcius : 
<input type="text" name="userCelcius" size="10">
<input type="submit" value="Calculate Temperature"/>
</form>
</body>
</html>