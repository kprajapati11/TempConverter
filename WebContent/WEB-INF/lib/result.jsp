<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<p>${ userTemp.getTempInCelcius() } degree Celcius when converted to Farenheit is:  ${ userTemp.getComputeFar() } Fahrenheit <br />
	</p>
<a href="index.jsp"> Select another temperature in Celcius</a>
</body>
</html>