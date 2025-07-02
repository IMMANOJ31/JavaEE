<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Boutique Registration</title>
  <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:wght@500&family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Roboto', sans-serif;
      background: linear-gradient(to right, #fff0f5, #e6e6fa);
      padding: 40px 20px;
    }

    .container {
      max-width: 500px;
      margin: auto;
      background-color: #fff;
      padding: 30px 25px;
      border-radius: 12px;
      box-shadow: 0 6px 20px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
      color: #c71585;
      font-family: 'Playfair Display', serif;
      margin-bottom: 25px;
    }

    label {
      font-weight: 500;
      display: block;
      margin: 12px 0 5px;
    }

    input, select {
      width: 100%;
      padding: 10px;
      border-radius: 6px;
      border: 1px solid #ccc;
      font-size: 15px;
      margin-bottom: 15px;
    }

    .buttons {
      text-align: center;
    }

    .buttons input {
      padding: 10px 24px;
      border: none;
      border-radius: 6px;
      font-size: 16px;
      cursor: pointer;
      margin: 0 10px;
    }

    .submit-btn {
      background-color: #c71585;
      color: #fff;
    }

    .reset-btn {
      background-color: #999;
      color: #fff;
    }

    .submit-btn:hover {
      background-color: #a0136f;
    }

    .reset-btn:hover {
      background-color: #777;
    }
  </style>
</head>

<body>
  <div class="container">
    <h2>Customer Registration</h2>
    <form action="registerCustomer" method="post">

      <label for="fullName">Full Name</label>
      <input type="text" id="fullName" name="fullName" required>

      <label for="email">Email</label>
      <input type="email" id="email" name="email" required>

      <label for="mobile">Mobile Number</label>
      <input type="text" id="mobile" name="mobile" maxlength="10" required>

      <label for="password">Password</label>
      <input type="password" id="password" name="password" required>

      <label for="style">style</label>
      <input type="text" id="style" name="style" required>

      <div class="buttons">
        <input type="submit" class="submit-btn" value="Register"><br>
        <input type="reset" class="reset-btn" value="Clear">
      </div>

    </form>
  </div>
</body>
</html>
