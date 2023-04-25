<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JLC Book Store</title>

<style type="text/css">
	.form-center {
	  display:flex;
	  justify-content: center;
	}
</style>
</head>
<body>
	<header>
		<div>
		<jsp:include page="Header.jsp">
			<jsp:param value="LIBRARIAN LOGIN" name="headingName"/>
		</jsp:include>
		</div>
	</header>


	<main>
		<div class="form-center">
		<font color=red size=4>${MSG}</font>
		<form action="adminLogin.jlc" method="post">
		<table>
			<tr>
				<td><span style="color: yellow;background-color: black">Enter Email Id</span></td>
				<td><input type="email" name="email" /></td>
			</tr>
		
			<tr>
				<td><span style="color: yellow;background-color: black"> Enter Password</span></td>
				<td><input type="password" name="password" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Login" " /></td>
			</tr>
		</table>
		</form>
		</div>
	</main>

</body>
</html>