<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JLC Book Store</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
.form-center table{
	  display:flex;
	  justify-content: center;
}
.center {
  margin-left: auto;
  margin-right: auto;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
	
</style>
</head>
<body>

	<header>
		<jsp:include page="AdminHeader.jsp">
		<jsp:param value="${ADMINREGISTERTO.fullName}" name="fullName"/>
		</jsp:include>
	</header>
	
	<main>
		<h1 style="text-align: center"><span style="color: yellow;background-color: black">DELETE BOOK</span></h1>
		<font color=red size=4>${MSG}</font>
		<table class="center">
			<tr style="font-weight: bold;">
				<td>ID</td>
				<td>Title</td>
				<td>AUTHOR</td>
				<td>CATEGOTY</td>
			</tr>
			<c:forEach var="data" items="${applicationScope.BOOKLIST}">
			<tr>
				<td>${data.bookId}</td>
				<td>${data.title}</td>
				<td>${data.author}</td>
				<td>${data.category}</td>
				<td>
							<form action="deleteBook.jlc">
								<input type="hidden" name="bookId" value="${data.bookId}"/>
								<input type="submit" value="Delete"/>
							</form>
				</td>
			</tr>	
			</c:forEach>
		</table>
	</main>
	
		
</body>
</html>