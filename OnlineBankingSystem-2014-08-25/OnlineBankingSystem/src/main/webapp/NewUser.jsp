<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css-styles/ForgotPasswordstyle.css"/>
</head>
<body>
<form action="UserRegistration" method="post">
<br><br>
&nbsp;UserName :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="username" ><br><br>
&nbsp;Password :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="password"><br><br>
&nbsp;Reenter Password:<input type="text" name="reenter"><br><br>
&nbsp;Address: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address"><br><br>
&nbsp;Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email"><br><br>
&nbsp;Phone number:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phonenumber"><br><br>
&nbsp;Country: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
<select name="country">
<option value="US">US</option>
<option value="India">India</option>
<option value="France">France</option>
<option value="Germany">Germany</option>
<option value="Srilanka">Sri Lanka</option>
<option value="Newzeland">New Zealand</option>
<option value="Canada">Canada</option>
</select><br><br>
Account No:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="accountno"><br><br>
<select name="forgotpassselect">
<option value="mothermaidan">What is your mother's maidan name?</option>
<option value="schoolname">What is your first school name?</option>
<option value="streetname">What is the name of the street where you grew up?</option>
</select><br><br>
&nbsp;&nbsp;<input type="text" name="answer"><br><br>
<input type="submit" value="submit">
</form>
</body>
</html>