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
    .table-container {
      max-width: 1000px;
      margin: 50px auto;
      padding: 30px;
      background-color: #ffffff;
      border: 2px solid #ccc;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    .btn-purple {
      background-color: #4b0082;
      color: white;
    }

    .btn-purple:hover {
      background-color: #9370db;
      color: white;
    }

    h2 {
      color: #4b0082;
      margin-bottom: 20px;
    }

    th {
      background-color: #4b0082;
      color: white;
    }

    .add-btn {
      margin-bottom: 20px;
      display: flex;
      justify-content: flex-end;
    }
  </style>
</head>
<body class="bg-light">

  <div class="container table-container">
    <h2 class="text-center">User List</h2>

    <!-- Add Button -->
    <div class="add-btn">
      <a href="register.jsp" class="btn btn-purple">Add New User</a>
    </div>

    <!-- User Table -->
    <table class="table table-bordered table-striped">
      <thead>
        <tr>
          <th>Sl No</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Gender</th>
          <th>Date of Birth</th>
          <th>Password</th>
          <th>Confirm Password</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${listOfUsers}" var="userDtos" varStatus="status">
          <tr>
            <td>${status.index + 1}</td>
            <td>${userDtos.firstName}</td>
            <td>${userDtos.lastName}</td>
            <td>${userDtos.gender}</td>
            <td>${userDtos.dob}</td>
            <td>${userDtos.password}</td>
            <td>${userDtos.confirmPassword}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>

</body>
</html>
