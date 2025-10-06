<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Registration Form</title>

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    .form-container {
      max-width: 500px;
      margin: 50px auto;
      padding: 30px;
      background-color: #ffffff;
      border: 2px solid #ccc;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    .btn-purple {
      background-color: #4b0082;
      color: white;
    }

    .btn-purple:hover {
      background-color: #9370db;
      color: white;
    }

    a {
      color: #4b0082;
      font-weight: bold;
      text-align: center;
      display: block;
      margin-top: 15px;
      text-decoration: none;
    }

    a:hover {
      color: #9370db;
      text-decoration: underline;
    }
  </style>
</head>
<body class="bg-light">

  <div class="container">
    <h2 class="text-center text-dark mt-4">Starting with WEB APPLICATION</h2>

    <form action="registerUser" method="post" class="form-container">
      <h1 class="text-center text-primary mb-4" style="color: #4b0082;">Form</h1>

      <div class="mb-3">
        <label for="firstName" class="form-label">First Name:</label>
        <input type="text" class="form-control" id="firstName" name="firstName" required>
      </div>

      <div class="mb-3">
        <label for="lastName" class="form-label">Last Name:</label>
        <input type="text" class="form-control" id="lastName" name="lastName" required>
      </div>

      <div class="mb-3">
        <label for="gender" class="form-label">Gender:</label>
        <input type="text" class="form-control" id="gender" name="gender" required>
      </div>

      <div class="mb-3">
        <label for="dob" class="form-label">Date of Birth:</label>
        <input type="date" class="form-control" id="dob" name="dob" required>
      </div>

      <div class="mb-3">
        <label for="pwd" class="form-label">Password:</label>
        <input type="password" class="form-control" id="pwd" name="password" required>
      </div>

      <div class="mb-3">
        <label for="confPwd" class="form-label">Confirm Password:</label>
        <input type="password" class="form-control" id="confPwd" name="confirmPassword" required>
      </div>

      <button type="submit" class="btn btn-purple w-100">Register</button>
    </form>
  </div>
</body>
</html>
