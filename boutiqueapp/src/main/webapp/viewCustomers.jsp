<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>View Customers - Boutique Bliss</title>
  <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Roboto', sans-serif;
      background: #fdf6f9;
      padding: 40px;
    }

    h2 {
      text-align: center;
      color: #c71585;
      margin-bottom: 30px;
    }

    table {
      width: 90%;
      margin: auto;
      border-collapse: collapse;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
      background-color: #fff;
    }

    th, td {
      padding: 12px 18px;
      text-align: center;
      border-bottom: 1px solid #eee;
    }

    th {
      background-color: #f7d2e7;
      color: #7b1a5b;
    }

    tr:hover {
      background-color: #fce8f2;
    }

    .back-btn {
      display: block;
      margin: 30px auto;
      text-align: center;
      background-color: #c71585;
      color: white;
      padding: 10px 25px;
      border-radius: 6px;
      text-decoration: none;
      font-weight: bold;
      width: fit-content;
    }

    .back-btn:hover {
      background-color: #a0136f;
    }
  </style>
</head>
<body>

  <h2>Registered Customers</h2>

  <c:choose>
    <c:when test="${not empty customerList}">
      <table>
        <thead>
          <tr>
            <th>S.No</th>
            <th>Full Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Password</th>
            <th>Style</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="customer" items="${customerList}" varStatus="status">
            <tr>
              <td>${status.index + 1}</td>
              <td>${customer.getFullName()}</td>
              <td>${customer.getEmail()}</td>
              <td>${customer.getMobile()}</td>
              <td>${customer.getPassword()}</td>
              <td>${customer.getStyle()}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </c:when>
    <c:otherwise>
      <p style="text-align: center; font-size: 18px; color: #666;">No customers registered yet.</p>
    </c:otherwise>
  </c:choose>

  <a href="index.jsp" class="back-btn">Back to Home</a>

</body>
</html>
