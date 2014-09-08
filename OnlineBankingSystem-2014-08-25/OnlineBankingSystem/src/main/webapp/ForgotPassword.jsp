<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css-styles/ForgotPasswordstyle.css" >
</head>
<body>
<form action="ForgotPassword" method="post">
<br><br>
<h4>&nbsp;&nbsp;&nbsp;&nbsp;Please select any one question and answer it so that if you forgot the password <br>
&nbsp;&nbsp;&nbsp;&nbsp;it will be used to recover your account </h4>
&nbsp;&nbsp;&nbsp;<select name="forgotpassq">
<option value="mothermaidan">What is your mother's maidan name?</option>
<option value="schoolname">What is your first school name?</option>
<option value="streetname">What is the name of the street where you grew up?</option>
</select><br><br>
&nbsp;&nbsp;<input type="text" name="answer"><br><br>
&nbsp;&nbsp;<input type="submit" value="submit">
</form>
</body>
</html>