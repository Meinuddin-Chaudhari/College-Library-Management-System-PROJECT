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
	.form-center {
	  display:flex;
	  justify-content: center;
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
		<div class="form-center">
		<font color=red size=4>${MSG}</font>
		<form action="selectBookSearchOption2.jlc" method="post">
		<h1  style="text-align: center"><span style="color: yellow;background-color: black">SEARCH BOOK</span></h1>
		
		<c:choose>
			<c:when test="${requestScope.OPTION eq 'bookId'}">
				<table>
					<tr>
						<td>Select ${requestScope.OPTION} :</td>
					</tr>
					<tr>
						<td>
							<select name="BOOKID">
								<option value="">-----Select ${requestScope.OPTION} -----</option>
								<c:forEach var="data" items="${applicationScope.BOOKLIST}">
									<option value="${data.bookId }">${data.bookId}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Next"></input>
						</td>
					</tr>
			    </table>
			</c:when>
			
			<c:when test="${requestScope.OPTION eq 'title'}">
				<table>
					<tr>
						<td>Select ${requestScope.OPTION} :</td>
					</tr>
					<tr>
						<td>
							<select name="TITLE">
								<option value="">-----Select ${requestScope.OPTION} -----</option>
								<c:forEach var="data" items="${applicationScope.BOOKLIST}">
									<option value="${data.title }">${data.title}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Next"></input>
						</td>
					</tr>
			    </table>
			</c:when>
			
			<c:when test="${requestScope.OPTION eq 'author'}">
				<table>
					<tr>
						<td>Select ${requestScope.OPTION} :</td>
					</tr>
					<tr>
						<td>
							<select name="AUTHOR">
								<option value="">-----Select ${requestScope.OPTION} -----</option>
								<c:forEach var="data" items="${applicationScope.BOOKLIST}">
									<option value="${data.author }">${data.author}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Next"></input>
						</td>
					</tr>
			    </table>
			</c:when>
			
			<c:when test="${requestScope.OPTION eq 'category'}">
				<table>
					<tr>
						<td>Select ${requestScope.OPTION} :</td>
					</tr>
					<tr>
						<td>
							<select name="CATEGORY">
								<option value="">-----Select ${requestScope.OPTION} -----</option>
								<c:forEach var="data" items="${applicationScope.BOOKLIST}">
									<option value="${data.category }">${data.category}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Next"></input>
						</td>
					</tr>
			    </table>
			</c:when>
		</c:choose>
		</form>
		</div>
	</main>	
	
		
</body>
</html>