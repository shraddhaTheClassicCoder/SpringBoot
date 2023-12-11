<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<table border="1">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student Address</th>
		</tr>

		<tr>
			<td>${student.sid}</td>
			<td>${student.name}</td>
			<td>${student.address}</td>
		</tr>
	</table>
</body>
</html>