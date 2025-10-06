<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Home - Passport Registration</title>
  <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;500;700&display=swap" rel="stylesheet">
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    body {
      font-family: 'Roboto', sans-serif;
      background: url('C:/Users/Rajashree/Downloads/passport.jpg') no-repeat center center/cover;
      min-height: 100vh;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      color: #ffffff;
    }

    .overlay {
      background: rgba(0, 0, 50, 0.7);
      padding: 50px 40px;
      border-radius: 15px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);
      text-align: center;
      max-width: 600px;
      width: 90%;
      animation: fadeIn 1s ease-in-out;
    }

    h1 {
      font-size: 40px;
      font-weight: 700;
      margin-bottom: 20px;
      color: #f0f8ff;
    }

    p {
      font-size: 18px;
      margin-bottom: 30px;
      line-height: 1.6;
      color: #e0e0e0;
    }

    a.button {
      display: inline-block;
      padding: 14px 30px;
      background-color: #28a745;
      color: #fff;
      text-decoration: none;
      font-size: 18px;
      font-weight: 500;
      border-radius: 8px;
      transition: background-color 0.3s ease;
    }

    a.button:hover {
      background-color: #218838;
    }

    footer {
      position: absolute;
      bottom: 15px;
      width: 100%;
      text-align: center;
      font-size: 14px;
      color: #cccccc;
    }

  </style>
</head>
<body>

  <div class="overlay">
    <h1>Passport Seva Portal</h1>
    <p>Apply for your passport in a few easy steps. Click the button below to get started.</p>
    <a class="button" href="userRegistration.jsp">Register Now</a>
    <a class="button" href="getUsers">Get Users</a>
  </div>

  <footer>
    &copy; 2025 Government of India | Passport Seva
  </footer>

</body>
</html>
