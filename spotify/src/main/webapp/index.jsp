<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spotify - Music for Everyone</title>
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
            background: url('https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4') no-repeat center center/cover;
            height: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .content {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 40px;
            border-radius: 12px;
            text-align: center;
            color: white;
            width: 90%;
            max-width: 500px;
        }

        .logo {
            font-size: 2.5em;
            font-weight: bold;
            color: #1DB954;
            margin-bottom: 20px;
        }

        .tagline {
            font-size: 1.2em;
            margin-bottom: 30px;
        }

        .btn {
            display: inline-block;
            margin: 10px;
            padding: 12px 25px;
            font-size: 1em;
            color: white;
            background-color: #1DB954;
            border: none;
            border-radius: 25px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none;
        }

        .btn1 {
                    display: inline-block;
                    margin: 10px;
                    padding: 12px 25px;
                    font-size: 1em;
                    color: white;
                    background-color: #1DB954;
                    border: none;
                    border-radius: 25px;
                    cursor: pointer;
                    transition: background-color 0.3s ease;
                    text-decoration: none;
                }

        .btn:hover {
            background-color: #17a44b;
        }
        .btn1:hover {
                    background-color: #17a44b;
                }
    </style>
</head>
<body>
    <div class="background">
        <div class="content">
            <div class="logo">Spotify</div>
            <div class="tagline">Millions of songs. Free on Spotify.</div>
            <a href="register.jsp" class="btn">Register</a>
            <a href="getAllUsers" class="btn1">Users</a>

        </div>
    </div>
</body>
</html>
