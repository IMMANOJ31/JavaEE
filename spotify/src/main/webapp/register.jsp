<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spotify - Register</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body, html {
            height: 100%;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background: url('https://images4.alphacoders.com/850/85006.jpg') no-repeat center center/cover;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .register-box {
            background-color: rgba(0, 0, 0, 0.75);
            padding: 40px;
            border-radius: 12px;
            width: 90%;
            max-width: 400px;
            text-align: center;
            color: white;
        }

        .register-box h2 {
            margin-bottom: 25px;
            color: #1DB954;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: none;
            border-radius: 6px;
        }

        .btn {
            width: 100%;
            padding: 12px;
            background-color: #1DB954;
            border: none;
            border-radius: 6px;
            color: white;
            font-size: 1em;
            cursor: pointer;
            margin-top: 15px;
        }

        .btn:hover {
            background-color: #17a44b;
        }

        .login-link {
            margin-top: 15px;
            display: block;
            color: #ccc;
            text-decoration: none;
            font-size: 0.9em;
        }

        .login-link:hover {
            color: white;
        }
    </style>
</head>
<body>
    <div class="register-box">
        <h2>Create Your Spotify Account</h2>
        <form action="userRegister" method="POST">
            <input type="text"  placeholder="Full Name" name="name" required>
            <input type="email" placeholder="Email Address" name="email" required>
            <input type="password" placeholder="Create Password" name="pass"  required>
            <input type="password" placeholder="Confirm Password" name="cpass" required>
            <button type="submit" class="btn">Create Account</button>
        </form>
    </div>
</body>
</html>
