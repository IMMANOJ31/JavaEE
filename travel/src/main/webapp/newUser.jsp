<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Travel Registration</title>
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

        .background {
            background-image: url('https://images.unsplash.com/photo-1507525428034-b723cf961d3e');
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .overlay {
            background-color: rgba(0, 0, 0, 0.6);
            padding: 40px;
            border-radius: 10px;
            width: 100%;
            max-width: 400px;
            color: white;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-top: 15px;
            font-size: 14px;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            margin-top: 5px;
            font-size: 16px;
        }

        button {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            background-color: #ff6347;
            border: none;
            color: white;
            font-size: 18px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #e5533d;
        }

        @media (max-width: 500px) {
            .overlay {
                margin: 0 10px;
                padding: 30px 20px;
            }
        }
    </style>
</head>
<body>
    <div class="background">
    <form action="User" method="post">
        <div class="overlay">
            <h2>Travel Details</h2>
            <form action="#" method="post">
                <label for="name">Full Name</label>
                <input type="text" id="name" name="name" required>

                <label for="gender">Gender</label>
                <input type="text" id="gender" name="gender" required>

                <label for="age">Age</label>
                <input type="text" id="age" name="age" required>

                <label for="email">Email Address</label>
                <input type="email" id="email" name="email" required>

                <label for="origin">Origin</label>
                <input type="text" id="origin" name="origin" required>

                <label for="destination">Destination</label>
                <input type="text" id="destination" name="destination" required>

                <button type="submit">Submit</button>
            </form>
        </div>
    </div>
</body>
</html>
