<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JLC Book Store</title>
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
		<h1 style="text-align: center"><span style="color: yellow;background-color: black">REQUESTED BOOK</span></h1>
		<h5 style="text-align: center; color: red">${sessionScope.CONFIRMSTATUS}</h5>
		<table class="center">
			<tr style="font-weight: bold;">
				<td>STUDENT ID</td>
				<td>BOOK ID</td>
				<td>TITLE</td>
				<td>AUTHOR</td>
				<td>CATEGOTY</td>
			</tr>
			<c:forEach var="requestedBookList" items="${sessionScope.REQUESTEDBOOKLIST}">
				<c:forEach var="bookList" items="${applicationScope.BOOKLIST}">
					<c:choose>
						<c:when test="${requestedBookList.bookId eq bookList.bookId}">
							<tr>
								<td>${requestedBookList.studentId}</td>
								<td>${bookList.bookId}</td>
								<td>${bookList.title}</td>
								<td>${bookList.author}</td>
								<td>${bookList.category}</td>
								<td>
											<form action="confirmBookRequest.jlc">
												<input type="hidden" name="studentId" value="${requestedBookList.studentId}"/>
												<input type="hidden" name="bookId" value="${bookList.bookId}"/>
												<input type="hidden" name="bookTitle" value="${bookList.title}"/>
												<input type="hidden" name="bookAuthor" value="${bookList.author}"/>
												<input type="hidden" name="bookCategory" value="${bookList.category}"/>
								
												<input type="submit" value="Confirm Request"/>
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