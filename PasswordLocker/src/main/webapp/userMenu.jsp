<%@page import="com.PasswordlockerEntity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>User Menu</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
    }

    .container {
      width: 400px;
      margin: 0 auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
    }
    h1 {
      text-align: center;
    }

    ul.menu {
      list-style-type: none;
      padding: 0;
      margin: 0;
    }

    ul.menu li {
      margin-bottom: 10px;
    }

    ul.menu li a {
      display: block;
      padding: 10px;
      background-color: #4CAF50;
      color: white;
      text-decoration: none;
      border-radius: 5px;
    }

    ul.menu li a:hover {
      background-color: #45a049;
      border: 2px solid red;
    }
  </style>
</head>
<body>
<% User user= (User)session.getAttribute("user"); %>
<%if(user != null){ %>
  <div class="container">
    <h2>User Menu</h2>
    <ul class="menu">
      <li><a href="account.jsp">Add New Account</a></li>
      <li><a href="">View All Accounts</a></li>
      <li><a href="">Delete By Name</a></li>
      <li><a href="">Update Account</a></li>
      <li><a href="">Get Account Name</a></li>
    </ul>
  </div>
  <%}else{ %>
  <h1 class="text-center">Don't have an account? <a href="user.jsp">Sign up</a></h1>
  <h1 class="text-center">please login for user functions <a href="signing.jsp">Sign up</a></h1>
    <h1 class="text-center">Back To Home <a href="Home.jsp">Home</a></h1>
  
  <%}%>
</body>
</html>
