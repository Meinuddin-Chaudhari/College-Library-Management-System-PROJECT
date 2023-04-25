<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url('img_girl.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>
<meta charset="ISO-8859-1">
<title>iNeuron Library</title>
<link rel="stylesheet" href="style.css">

</head>
<body style="background-image: url('library.jpg');"  > <br> 
	
       <div  class="topnav">
    <center>   <h2 >  <u style=" color: blue">LIBRARIAN </u>  </h2>  </center>
          <a class="active" href="RegisterLibrarian.jsp">REGISTER</a>
		  <a href="LoginAdmin.jsp">LOGIN </a> <br><br><br>
		  
		<center>    <h2 >  <u style=" color: blue">STUDENTS </u>  </h2>  </center>
		  <a href="RegisterStudent.jsp">REGISTER </a>
		  <a href="LoginStudent.jsp">LOGIN</a>
       </div>
       
       <div class="two">
       <%
		      String headingName=request.getParameter("headingName");
		      if(headingName==null)
		      {
			  %><br><br><br>
				<div><br><br>
				<center><h1 style="text-align: center"><span style="text-align: center; color: yellow;background-color: black">***WELCOME TO INEURON***</span></h1></center><br>
				<center><h1 style="text-align: center"><span style="text-align: center; color: yellow;background-color: black">***COLLEGE LIBRARY MANAGEMENT SYSTEM***</span></h1></center>
				</div>
			 <%
		     }else{
			  %>
				<div>

      <h1 style="text-align: center"><span style="text-align: center; color: yellow;background-color: black">${param.headingName}</span></h1> 
				</div>
			  <% 
		      }
	   %>
      </div> 
  
</body>
</html>