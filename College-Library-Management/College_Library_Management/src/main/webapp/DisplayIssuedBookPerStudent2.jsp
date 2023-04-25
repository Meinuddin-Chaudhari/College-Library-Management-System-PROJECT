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
		<jsp:include page="StudentHeader.jsp">
		<jsp:param value="${STUDENTREGISTERTO.fullName}" name="fullName"/>
		</jsp:include>
	</header>
	
	<main>
		<h1 style="text-align: center"><span style="color: yellow;background-color: black"">ISSUED BOOK</span></h1>
		<h5 style="text-align: center; color: red">${requestScope.MSG}</h5>
		<table class="center">
			<tr style="font-weight: bold;">
				<td>Student Id</td>
				<td>Book Id</td>
				<td>Book Title</td>
				<td>Book Author</td>
				<td>Book Category</td>
				<td>Borrowed Date</td>
				<td>Fine Amount</td>
			</tr>
				<c:forEach var="issuedBookList" items="${applicationScope.ISSUEDBOOKLISTWITHFINE}">
				   <c:choose>
						<c:when test="${issuedBookList.studentId eq sessionScope.STUDENTREGISTERTO.studentId}">
							<tr>
								<td>${issuedBookList.studentId}</td>
								<td>${issuedBookList.bookId}</td>
								<td>${issuedBookList.bookTitle}</td>
								<td>${issuedBookList.bookAuthor}</td>
								<td>${issuedBookList.bookCategory}</td>
								<td>${issuedBookList.borrowedDate}</td>
								<td>${issuedBookList.fineAmount}</td>
								
							</tr>
						</c:when>
					</c:choose>			
				</c:forEach>
		</table>
	</main>
</body>
</html>