<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Explore the World - Travel With Us</title>
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
            background-image: url('https://images.unsplash.com/photo-1501785888041-af3ef285b470?ixlib=rb-4.0.3&auto=format&fit=crop&w=1950&q=80'); /* New scenic background */
            background-size: cover;
            background-position: center;
            height: 100vh;
            position: relative;
            color: white;
        }

        .overlay {
            background-color: rgba(0, 0, 0, 0.6);
            height: 100%;
            width: 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
            padding: 0 20px;
        }

        nav {
            position: absolute;
            top: 20px;
            left: 50%;
            transform: translateX(-50%);
        }

        nav ul {
            list-style: none;
            display: flex;
            gap: 30px;
        }

        nav a {
            text-decoration: none;
            color: white;
            font-weight: bold;
            font-size: 18px;
            transition: color 0.3s;
        }

        nav a:hover {
            color: #ffd700;
        }

        h1 {
            font-size: 48px;
            margin-bottom: 20px;
        }

        p {
            font-size: 20px;
            margin-bottom: 30px;
        }

        .btn {
            background-color: #ff6347;
            color: white;
            padding: 12px 24px;
            border: none;
            border-radius: 25px;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none;
            display: inline-block;
        }

        .btn:hover {
            background-color: #e5533d;
        }

        h3 {
            margin-top: 40px;
            font-size: 24px;
        }

        a[href="users"] {
            margin-top: 10px;
            font-size: 18px;
            color: #fff;
            text-decoration: underline;
        }

        @media (max-width: 768px) {
            h1 {
                font-size: 32px;
            }

            p {
                font-size: 16px;
            }

            nav ul {
                flex-direction: column;
                gap: 15px;
            }
            h3 {
                font-size: 24px;
                color: #ffffff;
                margin-top: 40px;
                margin-bottom: 10px;
                font-weight: 600;
                letter-spacing: 1px;
            }
             nav ul {
                  flex-direction: column;
                  gap: 15px;
            }

        }
    </style>
</head>
<body>
    <div class="background">
        <div class="overlay">
            <nav>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Destinations</a></li>
                    <li><a href="#">Packages</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </nav>

            <h1>Discover Your Next Adventure</h1>
            <p>Explore breathtaking destinations around the world with us</p>
            <a href="newUser.jsp" class="btn">Get Started</a>

            <h3>Travellers Details</h3>
            <a href="users">List</a>
        </div>
    </div>
</body>
</html>
