<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Home - Boutique Bliss</title>
  <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;500;700&display=swap" rel="stylesheet">
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    body {
      font-family: 'Roboto', sans-serif;
      background: url('C:/Users/Rajashree/Downloads/boutique-bg.jpg') no-repeat center center/cover;
      min-height: 100vh;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      color: #ffffff;
    }

    .overlay {
      background: rgba(50, 0, 50, 0.7);
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
      color: #ffe4e1;
    }

    p {
      font-size: 18px;
      margin-bottom: 30px;
      line-height: 1.6;
      color: #f8f0ff;
    }

    a.button {
      display: inline-block;
      padding: 14px 30px;
      background-color: #ff69b4;
      color: #fff;
      text-decoration: none;
      font-size: 18px;
      font-weight: 500;
      border-radius: 8px;
      margin: 10px;
      transition: background-color 0.3s ease;
    }

    a.button:hover {
      background-color: #d052a4;
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
    <h1>Boutique Bliss</h1>
    <p>Explore our exclusive designer collection. Sign up to stay updated or browse our gallery.</p>
    <a class="button" href="registerCustomer.jsp">Register Now</a>
    <a class="button" href="viewCustomers">View Customers</a>
  </div>

  <footer>
    &copy; 2025 Boutique Bliss | Style Redefined
  </footer>

</body>
</html>
