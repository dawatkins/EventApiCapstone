<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Events</title>
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Start Date</th>
					<th>Venue</th>
					<th>City</th>
					<th>State</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${events}" var="event">
					<tr>
						<td>${event.name}</td>
						<td>${event.Dates.startDate}</td>
						<td>${event.EventsEmbedded.Venue.name}</td>
						<td>${event.EventsEmbedded.Venue.City.name}</td>
						<td>${event.EventsEmbedded.Venue.State.name}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>