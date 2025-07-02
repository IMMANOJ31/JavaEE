<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>User List</title>

  <!-- Bootstrap CSS --> 
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    body {
      background: linear-gradient(to right, #e0eafc, #cfdef3);
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    .table-container {
      max-width: 1100px;
      margin: 60px auto;
      padding: 40px;
      background-color: #ffffff;
      border-radius: 12px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
    }

    h2 {
      color: #2c3e50;
      font-weight: 600;
      text-align: center;
      margin-bottom: 30px;
    }

    table thead th {
      background-color: #2c3e50;
      color: #ffffff;
      text-align: center;
    }

    table tbody td {
      text-align: center;
      vertical-align: middle;
    }

    table tbody tr:nth-child(even) {
      background-color: #f2f6fc;
    }

    table {
      border-radius: 10px;
      overflow: hidden;
    }
  </style>
</head>
<body>

  <div class="container table-container">
    <h2>User Details</h2>

    <!-- User Table -->
    <table class="table table-bordered table-hover">
      <thead>
        <tr>
          <th>Sl No</th>
          <th>Passport Office</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Date of Birth</th>
          <th>Email</th>
          <th>Login ID</th>
          <th>Password</th>
          <th>Confirm Password</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${listOfUsers}" var="userDtos" varStatus="status">
          <tr>
            <td>${status.index + 1}</td>
            <td>${userDtos.getPassportOffice()}</td>
            <td>${userDtos.getGivenName()}</td>
            <td>${userDtos.getSurname()}</td>
            <td>${userDtos.getDob()}</td>
            <td>${userDtos.getEmail()}</td>
            <td>${userDtos.getLoginId()}</td>
            <td>${userDtos.getPassword()}</td>
            <td>${userDtos.getConfirmPassword()}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>

</body>
</html>
