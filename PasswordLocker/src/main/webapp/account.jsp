<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Add Accounts</title>
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

    .form-group {
      margin-bottom: 15px;
    }

    .form-group label {
      display: block;
      font-weight: bold;
    }

    .form-group input {
      width: 100%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    .form-group textarea {
      width: 100%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
      resize: vertical;
    }

    .form-group input[type="submit"] {
      background-color: #4CAF50;
      color: white;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>User Accounts Registration</h2>
    <form action="saveAccount" method="post">
      <div class="form-group">
        <label for="accountName">Account Name:</label>
        <input type="text" id="accountName" name="accountName" required>
      </div>
      <div class="form-group">
        <label for="username">User Name:</label>
        <input type="text" id="userName" name="username" required>
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
      </div>
      <div class="form-group">
        <label for="review">Review:</label>
        <input type="text" id="review" name="review" required>
      </div>
       <div class="form-group">
       <label for="id"> id</label>
        <input type="text" id="id" name="id" required>
      </div>
      <div class="form-group">
        <input type="submit" value="Register">
      </div>
       
    </form>
  </div>
</body>
</html>
