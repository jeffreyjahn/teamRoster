<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.lang.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Team Roster Team Info</title>
    <link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	<div id="header"><h1><c:out value="${ currTeam.getTeamName() }" /></h1>  <a href="home">Home</a> <a href="players?id=<c:out value="${ currID }" />">Add a Player</a></div>
	<div>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Action</th>
			</tr>
			<c:forEach var= "player" items="${ allPlayers }" varStatus="idx">
				<tr>
					<td>${ player.getFirstName() }</td>
					<td>${ player.getLastName() }</td>
					<td>${ player.getAge() }</td>
					<td><a href="deletePlayer?id=<c:out value="${ currID }" />&pId=${ idx.index }">Delete</a></td>
				</tr>
			</c:forEach>
		
		</table>
	</div>
</body>
</html>