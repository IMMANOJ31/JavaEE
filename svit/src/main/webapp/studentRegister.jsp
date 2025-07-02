<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-image: url('https://static.vecteezy.com/system/resources/thumbnails/013/545/853/small_2x/modern-colorful-wavy-line-background-design-wave-curve-abstract-background-for-business-landing-page-flyers-website-banner-and-presentation-vector.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .registration-form {
            background: rgba(255, 255, 255, 0.95); /* Slight transparency for background visibility */
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            width: 400px;
        }

        .registration-form h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #004080;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 6px;
            font-weight: bold;
        }

        .form-group input,
        .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 14px;
        }

        .form-group select {
            background-color: white;
        }

        .submit-btn {
            width: 100%;
            padding: 12px;
            background-color: #004080;
            color: white;
            font-weight: bold;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 10px;
        }

        .submit-btn:hover {
            background-color: #0055a5;
        }
    </style>
</head>
<body>

    <div class="registration-form">
        <h2>Student Registration</h2>
        <form action="register" method="post">
            <div class="form-group">
                <label for="fullname">Full Name</label>
                <input type="text" id="fullname" name="fullname" required>
            </div>

            <div class="form-group">
                <label for="email">Email ID</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="phone">Mobile Number</label>
                <input type="tel" id="phone" name="phone" required>
            </div>

            <div class="form-group">
                <label for="course">Select Course</label>
                <select id="course" name="course" required>
                    <option value="">-- Select --</option>
                    <option value="BSc">B.Sc</option>
                    <option value="BCA">BCA</option>
                    <option value="BCom">B.Com</option>
                    <option value="BA">BA</option>
                    <option value="MSc">M.Sc</option>
                    <option value="MCA">MCA</option>
                </select>
            </div>

            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob" required>
            </div>

            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" id="address" name="address" required>
            </div>

            <button type="submit" class="submit-btn">Register</button>
        </form>
    </div>

</body>
</html>
