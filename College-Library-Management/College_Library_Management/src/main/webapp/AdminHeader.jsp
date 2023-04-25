<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
	
</style>
</head>
<body  bgcolor="#d5ff00" >
	<div class="topnav">
		  <a href="AddBook.jsp">ADD BOOK</a>
		  <a href="DeleteBook.jsp">DELETE BOOK</a>
		  <a href="UpdateBook.jsp">UPDATE BOOK</a>
		  <a href="SelectBookSearchOption.jsp">SEARCH BOOK</a>
		  <a href="IssueRequestedBook.jsp">ISSUED BOOK</a>
		   <a href="DisplayIssuedBook.jsp">DISPLAY ISSUED BOOK</a>   
	<div class="logout-container"><br><br>
    <form action="logout.jlc">
       <button type="submit" style="text-align: center;color: yellow;background-color: black">LOGOUT</button>
<!--       <div class="User"> -->
<%--       	<label for="">${param.fullName}</label> --%>
<!--       </div> -->  
    </form>
  </div>
</div>


</body>
</html>