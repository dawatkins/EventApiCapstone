<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Events</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Start Date</th>
					<th>Venue Details</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${events}" var="event">
					<tr>
						<td>${event.name}</td>
						<td>${event.date}</td>
						 <td>${event.details}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>