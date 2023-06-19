<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>User Sign In</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: grey;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0px 0px 10px 10px black; 
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
      
    }
    h1 {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-group {
      margin-bottom: 20px;
    }

    .form-group label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
    }

    .form-group input[type="email"],
    .form-group input[type="password"] {
      width: 100%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }

    .form-group input[type="submit"] {
      padding: 10px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      position: relative;
      left: 170px;
    }

    .form-group input[type="submit"]:hover {
      background-color: #45a049;
    }
   
   
  </style>
</head>
<body>


<h1><%= (String)session.getAttribute("saveMessage") %></h1>

  <div class="container">
    <h2>User Sign In</h2>
    <form action="login" method="post">
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
      </div>
      <div class="form-group">
        <input type="submit" value="Sign In">
      </div>
    </form>
    <p class="text-center">Don't have an account? <a href="user.jsp">Sign up</a></p>
    <p class="text-center">Back To Home <a href="Home.jsp">Home</a></p>
  </div>
</body>
</html>
