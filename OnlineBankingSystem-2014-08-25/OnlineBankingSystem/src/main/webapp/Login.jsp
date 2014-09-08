<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css-styles/loginstyle.css" >
</head>
<body>
<form action="Login" method="post">
<br>
<br>
<div id="heading">Welcome to KLS Bank </div>
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="OpenAccount.jsp" style="text-align:center">Click here for instructions to open account</a><br><br><br>
<div id="logincontainer">
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
UserId :<input type="text" name="userid" ><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Password :&nbsp;&nbsp;&nbsp;<input type="password" name="password"><br><br>
<input type="submit"  value="Submit"><br><br>
<a href="NewUser.jsp">New User</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<a href="ForgotPassword.jsp" style="text-color:black">Forgot Password</a><br>
</div>
</form>
</body>
</html>