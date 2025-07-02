<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SVIT</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f5f5f5;
            color: #333;
        }

        header {
            background-color: #004080;
            color: orange;
            padding: 20px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .logo {
            font-size: 26px;
            font-weight: bold;
        }

        nav ul {
            list-style: none;
            display: flex;
            gap: 20px;
        }

        nav a {
            color: white;
            text-decoration: none;
            font-weight: 500;
        }

        nav a:hover {
            text-decoration: underline;
        }

        .hero {
            background: url('https://gyaanarth.com/wp-content/uploads/2022/06/sai-vidhya-institute-lg.jpg') no-repeat center center/cover;
            color: white;
            text-align: center;
            padding: 100px 20px;
        }

        .hero h1 {
            font-size: 48px;
            margin-bottom: 15px;
        }

        .hero p {
            font-size: 20px;
            margin-bottom: 25px;
        }

        .btn {
            background-color: #ff9900;
            color: white;
            padding: 12px 25px;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
        }

        .btn:hover {
            background-color: #e68a00;
        }

        .register-section {
            background-color: white;
            max-width: 600px;
            margin: 40px auto;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            text-align: center;
        }

        .register-section h2 {
            margin-bottom: 15px;
            color: #004080;
        }

        .register-section a {
            display: inline-block;
            margin-top: 15px;
            text-decoration: none;
            padding: 10px 20px;
            background-color: #004080;
            color: white;
            border-radius: 5px;
            font-weight: bold;
        }

        .register-section a:hover {
            background-color: #003366;
        }

        .details-section b:hover {
            background-color: #003366;
        }

        footer {
            background-color: #004080;
            color: white;
            text-align: center;
            padding: 15px;
            margin-top: 60px;
        }
    </style>
</head>
<body>
    <header>
        <div class="logo">SVIT</div>
        <nav>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Courses</a></li>
                <li><a href="#">Admissions</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>

    <section class="hero">
        <h1>Welcome to SVIT</h1>
        <p>Empowering the future through quality education.</p>
        <a href="#" class="btn">Explore More</a>
    </section>

    <section class="register-section">
        <h2>Register for Admission</h2>
        <p>Start your academic journey with SVIT today. Fill out the registration form to apply for your desired course.</p>
        <a href="studentRegister.jsp">Register Now</a>
         <h2>Student Details</h2>
         <a href="studentDetails">List</a>
    </section>

    <footer>
        <p>&copy; 2025 SVIT College. All rights reserved.</p>
    </footer>
</body>
</html>
