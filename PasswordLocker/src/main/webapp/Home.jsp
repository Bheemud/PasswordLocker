<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>

<style type="text/css">
body {
	
	background-color: grey;
}
h1{
color: green;
position:relative;
text-align: center;
bottom: 370px;
}
a{
text-decoration: none;
border: 2px solid darkblue;
background-color: lightblue;
margin:10px;
text-align:center;
display:flex;
display: block;
width: 10%;
color: black;
position: relative;
left: 590px;
bottom: 250px;

}
a:hover{
background-color: black;
color:white;
}
div{
background-color: lightblue;
height: 400px;
width: 410px;
position: relative;
left: 468px;
border-radius: 10%;
box-shadow: 10px 5px 5px 5px black;
}
</style>
</head>
<body>
<div></div>
<h1>welcome to password Locker</h1>
<a href="user.jsp">New User</a>
<a href="signing.jsp">Sign-in</a>
</body>
</html>



