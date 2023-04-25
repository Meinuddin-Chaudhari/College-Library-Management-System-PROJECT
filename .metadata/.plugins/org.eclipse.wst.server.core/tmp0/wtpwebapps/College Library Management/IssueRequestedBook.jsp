<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JLC Book Store</title>
<style type="text/css">
	
</style>

</head>
<body>

	<header>
		<jsp:include page="AdminHeader.jsp">
		<jsp:param value="${ADMINREGISTERTO.fullName}" name="fullName"/>
		</jsp:include>
	</header>
	
	<main>
		<%
    		response.sendRedirect(request.getContextPath() + "/issueRequestedBook.jlc");
         %>
	</main>
</body>
</html>