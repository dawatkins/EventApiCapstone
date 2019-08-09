<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h1 class="text-primary">Search Below for Events</h1>
		<p></p>
		<form action="/list">
			<p>
				Insert a keyword to search by: <input type="text" id="keyword"
					name="keyword">
				<button type="submit" class="btn btn-primary">Submit</button>
			</p>
		</form>

		<form action="/list">
			<p>
				Select a city <select name="city">
					<c:forEach var="city" items="${cities}">
						<option value="${city}">${city}</option>
					</c:forEach>
				</select>
				<button type="submit" class="btn btn-primary">Submit</button>
			</p>
		</form>

		<form action="/list">
			<label for="start">Start date:</label> <input type="date" id="date"
				name="date" value="2019-08-09" >
				<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>