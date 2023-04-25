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
		<h1  style="text-align: center"><span style="color: yellow;background-color: black">Update Book</span></h1>	
			<form action="updateBook.jlc">
				<table class="center">
					<tr style="font-weight: bold;">
						<td>ID</td>
						<td>Title</td>
						<td>AUTHOR</td>
						<td>CATEGOTY</td>
					</tr>
					
					<c:forEach var="data" items="${applicationScope.BOOKLIST}">
						<tr>
							<td>	
								<input type="text" name="bookId" value="${data.bookId}" readonly/>
							</td>
							
							<td>	
								<input type="text" name="title" value="${data.title}"/>
							</td>
							
							<td>	
								<input type="text" name="author" value="${data.author}"/>
							</td>
							
							<td>	
								<input type="text" name="category" value="${data.category}"/>
							</td>
							
							<td>	
								<input type="submit" value="Update"/>
							</td>
						</tr>	
					 </c:forEach>
				</table>
			</form>
			
		
	</main>
	
		
</body>
</html>