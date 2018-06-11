<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.lang.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Team Roster New Player</title>
    <link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	<h1>Add a player to team </h1>
	<form action="players?id=${ currID }" method="Post">
		First Name: <input type="text" name="firstName">
		Last Name: <input type="text" name="lastName">
		Age: <input type="number" name="age">
		<input type="submit" value="Create!">
	</form>
</body>
</html>