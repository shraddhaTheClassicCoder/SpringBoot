<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to My Book Store</h1>
	<form action="/save" method="post">
		<table>
			<tr>
				<th>Book Name:</th>
				<td><input type="text" name="bname" /></td>
			</tr>

			<tr>
				<th>Book Author:</th>
				<td><input type="text" name="bookAuthor" /></td>
			</tr>

			<tr>
				<th>Book Price:</th>
				<td><input type="text" name="price" /></td>
			</tr>

			<tr>

				<td><input type="submit" name="Submit" /></td>
			</tr>
		</table>


	</form>
</body>
</html>