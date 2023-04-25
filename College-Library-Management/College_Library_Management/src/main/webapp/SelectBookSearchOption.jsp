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
<body>

	<header>
		<jsp:include page="AdminHeader.jsp">
		<jsp:param value="${ADMINREGISTERTO.fullName}" name="fullName"/>
		</jsp:include>
	</header>
	
	<main>
		<div class="form-center">
		<font color=red size=4>${MSG}</font>
		<form action="selectBookSearchOption.jlc" method="post">
		<h1  style="text-align: center"><span style="color: yellow;background-color: black">SEARCH BOOK</span></h1>
		<table>
			<tr>
				<td>Select Option :</td>
			</tr>
		
			<tr>
				<td>
					<select name="CATEGORY">
						<option value="">-----Select Option-----</option>
						<option value="bookId">bookId</option>
						<option value="title">title</option>
						<option value="author">author</option>
						<option value="category">category</option>
					</select>
				</td>
			</tr>
			<tr>
				<td> <input type="submit" value="next"/> </td>
			</tr>
		</table>
		</form>
		</div>
	</main>	
	
		
</body>
</html>