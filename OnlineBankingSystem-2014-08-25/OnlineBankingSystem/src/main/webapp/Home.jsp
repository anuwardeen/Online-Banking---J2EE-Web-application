<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css-styles/Homestyle.css" >
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
  function CallServlet()
  {
	  document.location.href="Logout";
  }
  function CallViewPersonalInfo()
  {
	  document.location.href="ViewPersonalInfo.jsp";
  }
  function CallViewAccount()
  {
	  document.location.href="ViewAccount.jsp";
  }
  function CallViewTransaction()
  {
	  document.location.href="ViewTransaction.jsp";
  }
  function CallPerformTransaction()
  {
	  document.location.href="PerformTransaction.jsp";
  }
  $(document).ready(function(){
	  $('#container').click(function(){
		  $('#slider').slideToggle('slow');
	  });
	  
  });
</script>
</head>
<body>
<h3> KLS Bank </h3>
<div id="username"><h5>Welcome <%=session.getAttribute("user") %></h5></div>
 <input type="image" src="images/logout.png" onclick="CallServlet();" height="30px" width="80px" style="float:right"><br>
<br>
<div id="main">
<div id="container" ><input type="image" src="images/ViewOptions.png" height="40px" width="120px"></div><br>
<div id="slider">
<input type="image" src="images/PersonalInformation.png" onclick="CallViewPersonalInfo();"><br/><br>
<input type="image" src="images/ViewAccount.png" onclick="CallViewAccount();"><br/><br>
<input type="image" src="images/PerformTransaction.png" onclick="CallPerformTransaction();"><br/><br>
<input type="image" src="images/ViewTransaction.png" onclick="CallViewTransaction();"><br/><br>
</div>

<div id="heading">
  Thank you for Banking With us !!!!! <br> 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; We have more than 10,000 branches across 40 countries. <br><br>
 <img src="images/water.JPG" height=300px />
</div>
</div>
</body>
</html>