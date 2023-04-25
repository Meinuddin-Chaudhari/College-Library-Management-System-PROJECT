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
		<%
    		response.sendRedirect(request.getContextPath() + "/showMyRequestedBookList.jlc");
         %>
	</main>
	
</body>
</html>