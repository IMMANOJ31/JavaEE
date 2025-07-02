<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: url('https://cdn.pixabay.com/photo/2021/11/25/19/50/tape-6824489_640.jpg') no-repeat center center fixed;
        background-size: cover;
        color: #fff;
    }

    h1 {
        text-align: center;
        margin-top: 20px;
        color: #1DB954;
    }

    table {
        width: 80%;
        margin: 40px auto;
        border-collapse: collapse;
        background-color: rgba(0, 0, 0, 0.7);
    }

    th, td {
        padding: 12px;
        border: 1px solid #fff;
        text-align: center;
    }

    th {
        background-color: #1DB954;
        color: #000;
    }

    td {
        color: #fff;
    }

    tr:hover {
        background-color: rgba(255, 255, 255, 0.1);
    }
</style>
</head>
<body>

<h1>The list of users</h1>
<table>
    <tr>
        <th>Sl no.</th>
        <th>Full name</th>
        <th>Email</th>
        <th>Password</th>
        <th>ConfirmPassword</th>
    </tr>

    <c:forEach items="${ListOfUsers}" var="dto" varStatus="status">
    <tr>
        <td>${status.index+1}</td>
        <td>${dto.getFullName()}</td>
        <td>${dto.getEmail()}</td>
        <td>${dto.getPassword()}</td>
        <td>${dto.getConfirmPassword()}</td>
    </tr>
    </c:forEach>

</table>
</body>
</html>
