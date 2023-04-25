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
		<jsp:include page="StudentHeader.jsp">
		<jsp:param value="${STUDENTREGISTERTO.fullName}" name="fullName"/>
		</jsp:include>
	</header>
	
</body>
</html>