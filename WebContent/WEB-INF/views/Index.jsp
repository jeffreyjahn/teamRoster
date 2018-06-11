<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.lang.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Team Roster</title>
    <link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	<div id="header"><h1>Roster</h1> <a href="teams">New Team</a></div>
	<div>
		<table>
			<tr>
				<th>Team</th>
				<th>Players</th>
				<th>Action</th>
			</tr>
			<c:forEach var= "team" items="${ roster }" varStatus="idx">
				<tr>
					<td>${ team.getTeamName() }</td>
					<td>${ team.getPlayers().size() }</td>
					<td><a href="teams?id=${ idx.index }">Details</a> <a href="deleteTeam?id=${ idx.index }">Delete</a></td>
				</tr>
			</c:forEach>
		
		</table>
	</div>
</body>
</html>