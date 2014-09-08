<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='http://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
<style type="text/css">
table,td,th
{
border:1px solid green;
font-family: 'Oxygen' ,sans-serif; 
}
th
{
 background-color:green;
 color:white;
}
body{

background-color:#f8f8ff;
}
.container{
 margin-left: auto;
 margin-right: auto;
 width: auto;
}
</style>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){

$.get('ViewUserAccount',function(responseJson){
	if(responseJson!=null){

		var table1=$("#customertable");
		$.each(responseJson,function(key,value){
		var rownew=$("<tr><td></td><td></td></tr>");	
			rownew.children().eq(0).text(value['userid']);
			rownew.children().eq(1).text(value['accountno']);
			rownew.children().eq(2).text(value['balance']);
			rownew.appendTo(table1);
		});
	}
	
});	
	$("#tbldiv").show();
	
});

function CallServlet()
{
	  document.location.href="Logout";
}

</script>
</head>
<body>
Welcome <%=session.getAttribute("user") %><br><br>
<input type="image" src="images/logout.png" onclick="CallServlet();" height="30px" width="80px" style="float:right"><br>
<div id="tbldiv">
<table cellspacing="0" id="customertable">
<tr>
<th>Userid</th>
<th>Account No</th>
</tr>
</table> 
</div>

</body>
</html>