<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-image: url('https://images.unsplash.com/photo-1503676260728-1c00da094a0b'); /* Replace with your image URL if needed */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            margin: 0;
            padding: 40px;
            color: #fff;
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
            background-color: rgba(0, 0, 0, 0.6);
            padding: 15px;
            border-radius: 10px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: rgba(255, 255, 255, 0.95);
            color: #333;
            border-radius: 10px;
            overflow: hidden;
        }

        th, td {
            padding: 12px;
            border: 1px solid #ccc;
            text-align: left;
        }

        th {
            background-color: #3f51b5;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Hello, ${uName}</h1>
    <h1>List of Students</h1>
    <table>
        <tr>
            <th>Sl no</th>
            <th>Full name</th>
            <th>Email id</th>
            <th>Mobile</th>
            <th>Course</th>
            <th>DOB</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${listOfStudents}" var="dto" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${dto.getFullName()}</td>
                <td>${dto.getEmailId()}</td>
                <td>${dto.getPhoneNumber()}</td>
                <td>${dto.getCourse()}</td>
                <td>${dto.getDob()}</td>
                <td>${dto.getAddress()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
