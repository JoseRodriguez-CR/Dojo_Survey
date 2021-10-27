<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Dojo Survey Results</title>
		<link rel="stylesheet" href="/CSS/stylesheet.css" />
	</head>
	<body class = "container">
		<c:set var="result" value="${ result }"/>
		<h1 class = "java" >Submitted Info with ${ result.getLanguage() } as Favorite Language</h1>
		<p><strong>Name:</strong> <c:out value="${ result.getName() }"/></p>
		<p><strong>Language:</strong> <c:out value="${ result.getLanguage() }"/></p>
		<p><strong>Location:</strong> <c:out value="${ result.getLocation() }"/></p>
		<p><strong>Comment:</strong> <c:out value="${ result.getComment() }"/></p>
		<a href = "/" class = "btn">Go Back</a>
</body>
</html>