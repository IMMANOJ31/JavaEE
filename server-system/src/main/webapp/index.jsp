<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Home Page</title>

  <!-- Bootstrap CSS CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    body {
      background-color: #f9f9f9;
      color: #2f2f2f;
      height: 100vh;
    }
    .btn-purple {
      background-color: #9370db;
      color: white;
    }
    .btn-purple:hover {
      background-color: #4b0082;
      color: white;
    }
  </style>
</head>
<body class="d-flex align-items-center justify-content-center">

  <div class="text-center p-4">
    <h1 class="text-primary mb-4" style="color: #4b0082;">Welcome to Our Web Application</h1>
    <p class="lead text-secondary mb-4">
      Get started by registering your details. Click the button below to go to the registration form.
    </p>

    <div class="d-grid gap-3 col-6 mx-auto">
      <a href="register.jsp" class="btn btn-purple btn-lg">Go to Registration</a>
      <a href="getAllUsers" class="btn btn-purple btn-lg">Get All Users</a>
    </div>
  </div>

</body>
</html>
