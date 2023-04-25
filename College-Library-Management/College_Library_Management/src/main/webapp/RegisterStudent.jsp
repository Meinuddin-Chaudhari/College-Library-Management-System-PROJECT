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
			<jsp:param value="STUDENT REGISTRATION" name="headingName"/>
		</jsp:include>
		</div>
	</header>
	
	<main>
		<h4 style="color: red; size: 4" align="center">${MSG}</h4>
		<div class="form-center">
		<form action="studentRegistration.jlc" method="post">
		<table>
			<tr>
				<td><span style="color: yellow;background-color: black">Full Name</span></td>
				<td><input type="text" name="fullname" /></td>
			</tr>
			
			<tr>
				<td><span style="color: yellow;background-color: black"> Email Id</span></td>
				<td><input type="email" name="email" /></td>
			</tr>
			
			<tr>
				<td><span style="color: yellow;background-color: black">Phone Number</span></td>
				<td><input type="text" name="phone" /></td>
			</tr>
			
			<tr>
				<td><span style="color: yellow;background-color: black"> Enter DOB</span></td>
				<td><input type="date" name="dob" /></td>
			</tr>
			
			
			
			<tr>
				<td><span style="color: yellow;background-color: black">Enter Password</span></td>
				<td><input type="password" name="password1" /></td>
			</tr>
			
			<tr>
				<td><span style="color: yellow;background-color: black">Confirm Password</span></td>
				<td><input type="password" name="password2" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Register" /></td>
			</tr>
		</table>
		</form>
		</div>
	</main>
</body>
</html>