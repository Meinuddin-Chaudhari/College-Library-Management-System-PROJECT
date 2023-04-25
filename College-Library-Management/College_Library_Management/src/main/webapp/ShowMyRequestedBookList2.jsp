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
		<jsp:include page="StudentHeader.jsp">
		<jsp:param value="${STUDENTREGISTERTO.fullName}" name="fullName"/>
		</jsp:include>
	</header>
	
	<main>
		<h1  style="text-align: center"><span style="color: yellow;background-color: black">REQUESTED BOOK</span></h1>
		<h5 style="text-align: center; color: red">${MSG}</h5>
		<table class="center">
			<tr style="font-weight: bold;">
				<td>ID</td>
				<td>Title</td>
				<td>AUTHOR</td>
				<td>CATEGOTY</td>
			</tr>
			<c:forEach var="requestedBookId" items="${sessionScope.REQUESTEDBOOKIDLIST}">
				<c:forEach var="data" items="${applicationScope.BOOKLIST}">
					<c:choose>
						<c:when test="${requestedBookId eq data.bookId}">
							<tr>
								<td>${data.bookId}</td>
								<td>${data.title}</td>
								<td>${data.author}</td>
								<td>${data.category}</td>
								<td>
											<form action="removeBookRequest.jlc">
												<input type="hidden" name="bookId" value="${data.bookId}"/>
												<input type="submit" value="Remove Request"/>
											</form>
								</td>
							</tr>
						</c:when>
					</c:choose>	
				</c:forEach>
			</c:forEach>
		</table>
	</main>
	
</body>
</html>	