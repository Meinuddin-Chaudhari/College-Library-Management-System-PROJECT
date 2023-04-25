<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
<body >

	<header>
		<jsp:include page="AdminHeader.jsp">
		<jsp:param value="${ADMINREGISTERTO.fullName}" name="fullName"/>
		</jsp:include>
	</header>
	
	<main>
		<div class="form-center">
		<font color=red size=4>${MSG}</font>
		
		<form action="addBook.jlc" method="post">
		<h1 style="text-align: center"><span style="color: yellow;background-color: black">ADD BOOK</span></h1>
		<table>
			<tr>
				<td><span style="color: yellow;background-color: black">Title</span></td>
				<td><input type="text" name="title" /></td>
			</tr>
		
			<tr>
				<td><span style="color: yellow;background-color: black">Author</span></td>
				<td><input type="text" name="author" /></td>
			</tr>
			
			<tr>
				<td><span style="color: yellow;background-color: black">Category</span></td>
				<td><input type="text" name="category" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Add Now" /></td>
			</tr>
		</table>
		</form>
		</div>
	</main>	
	
		
</body>
</html>