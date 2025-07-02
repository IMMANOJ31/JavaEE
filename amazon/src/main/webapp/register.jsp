<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Amazon Registration</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-image: url('https://images.unsplash.com/photo-1580910051073-6ec2b6d6e6cb');
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .form-container {
            background-color: rgba(255, 255, 255, 0.95);
            padding: 30px 40px;
            border-radius: 10px;
            width: 400px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);
        }

        .form-container h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #232f3e; /* Amazon primary color */
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
            font-weight: bold;
        }

        input[type="text"],
        input[type="tel"],
        input[type="email"],
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        .gender-group {
            margin-bottom: 15px;
        }

        .gender-group label {
            margin-right: 10px;
            font-weight: normal;
        }

        .submit-btn {
            background-color: #f0c14b;
            color: #111;
            border: 1px solid #a88734;
            padding: 10px 20px;
            font-size: 16px;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        .submit-btn:hover {
            background-color: #ddb347;
        }

        .footer {
            margin-top: 15px;
            font-size: 12px;
            text-align: center;
            color: #555;
        }
    </style>
</head>
<body>
    <div class="form-container">

        <h2>Amazon Registration</h2>
        <form action="registerUser" method="post">
            <label for="fname">First Name</label>
            <input type="text" id="fname" name="fname" required>

            <label for="lname">Last Name</label>
            <input type="text" id="lname" name="lname" required>

            <label for="phone">Phone Number</label>
            <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" required>

            <label for="gender">Gender</label>
            <input type="text" id="gender" name="gender" required>

            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>

            <button type="submit" class="submit-btn">Submit</button>
        </form>
        <div class="footer">By continuing, you agree to Amazon's Conditions of Use and Privacy Notice.</div>
    </div>
</body>
</html>
