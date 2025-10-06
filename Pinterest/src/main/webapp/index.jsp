<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Pinterest</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f8f8f8;
      padding: 20px;
    }
    h2 {
      color: #bd081c;
    }
    form {
      background-color: #fff;
      padding: 20px;
      max-width: 400px;
      border-radius: 8px;
      box-shadow: 0 2px 6px rgba(0,0,0,0.1);
    }
    label {
      display: block;
      margin-top: 10px;
      font-weight: bold;
    }
    input[type="text"],
    input[type="date"] {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    input[type="submit"] {
      margin-top: 15px;
      background-color: #e60023;
      color: white;
      padding: 10px 15px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    input[type="submit"]:hover {
      background-color: #cc001f;
    }
  </style>
</head>
<body>

<h2>Pinterest</h2>
  <form>
    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" name="firstName">

    <label for="lastName">Last Name:</label>
    <input type="text" id="lastName" name="lastName">

    <label for="gender">Gender:</label>
    <input type="text" id="gender" name="gender">

    <label for="dob">Date of Birth:</label>
    <input type="date" id="dob" name="dob">

    <input type="submit" value="SUBMIT">
  </form>

</body>
</html>

