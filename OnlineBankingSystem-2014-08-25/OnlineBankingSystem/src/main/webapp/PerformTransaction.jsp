<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css-styles/ForgotPasswordstyle.css" >
<link rel="stylesheet" type="text/css" href="css-styles/Homestyle.css" >
<script type="text/javascript">
  function CallServlet()
  {
	  document.location.href="Logout";
  }
</script>
</head>
<body>
<input type="image" src="images/logout.png" onclick="CallServlet();" height="30px" width="80px" style="float:right"><br>
<form action="Transaction" method="post">
<h3> Enter Receipient's account no</h3><br>
<input type="text" name="receiveraccno">
<h3>Enter Amount below</h3><br>
<input type="text" name="amount"><br>
<input type="submit" value="submit">
</form>
</body>
</html>