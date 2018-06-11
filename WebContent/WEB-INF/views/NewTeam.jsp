<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.lang.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Team Roster New Team</title>
    <link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	<h1>Create a new Team</h1>
	<form action="teams" method="Post">
		Team Name: <input type="text" name="teamName">
		<input type="submit" value="Create!">
	</form>
</body>
</html>