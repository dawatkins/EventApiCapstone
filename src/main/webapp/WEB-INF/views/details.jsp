<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h1>${event[0].name} - Details</h1>
		<table class="table">
			<tr>
				<th scope="row">Event ID</th>
				<td>${event[0].id}</td>
			</tr>
			<tr>
				<th scope="row">Event</th>
				<td>${event[0].name}</td>
			</tr>
			<tr>
				<th scope="row">Event Date</th>
				<td>${event[0].date}</td>
			</tr>
			<tr>
				<th scope="row">Event Details</th>
				<td>${event[0].details}</td>
			</tr>
			<tr>
				<th scope="row">TicketMaster</th>
				<td><a href=${ event[0].url }><button>Buy Tickets</button></a></td>
			</tr>
			
		</table>
</body>
</html>