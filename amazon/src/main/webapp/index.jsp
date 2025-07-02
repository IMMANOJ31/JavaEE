<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Amazon Login Portal</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('https://images.unsplash.com/photo-1523275335684-37898b6baf30'); /* Optional background */
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .amazonApp {
            background-color: rgba(255, 255, 255, 0.95);
            padding: 40px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
        }

        h1 {
            margin-bottom: 20px;
            color: #232f3e;
        }

        .register-btn {
            padding: 12px 25px;
            font-size: 16px;
            border: none;
            border-radius: 8px;
            background-color: #f0c14b;
            color: #111;
            cursor: pointer;
            transition: 0.3s;
            border: 1px solid #a88734;
        }

        .register-btn:hover {
            background-color: #ddb347;
        }
    </style>
</head>
<body>
    <div class="amazonApp">
        <h1>Welcome to Amazon Portal</h1>
        <a href="register.jsp"><button aria-label="Go to registration page">Register Now</a>
        <a href="userDetails"><button aria-label="Get user details">Get all users</a>
    </div>
</body>
</html>
