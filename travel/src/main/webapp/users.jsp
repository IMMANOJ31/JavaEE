<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Travellers</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
                        url('https://wallpaperaccess.com/full/706923.jpg') no-repeat center center fixed;
            background-size: cover;
            color: #fff;
        }

        h1 {
            text-align: center;
            margin-top: 30px;
            color: #fff;
        }

        table {
            width: 90%;
            margin: 30px auto;
            border-collapse: collapse;
            background-color: rgba(255, 255, 255, 0.95);
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
            border-radius: 8px;
            overflow: hidden;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px 15px;
            text-align: center;
            color: #333;
        }

        th {
            background-color: #007BFF;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e9e9e9;
        }
    </style>
</head>
<body>
    <h1>List of Travellers</h1>
    <table>
        <tr>
            <th>Sl no.</th>
            <th>Full name</th>
            <th>Gender</th>
            <th>Age</th>
            <th>Email</th>
            <th>Origin</th>
            <th>Destination</th>
        </tr>
        <c:forEach items="${listOfTravellers}" var="travellersDto" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${travellersDto.getFullName()}</td>
                <td>${travellersDto.getGender()}</td>
                <td>${travellersDto.getAge()}</td>
                <td>${travellersDto.getEmail()}</td>
                <td>${travellersDto.getOrigin()}</td>
                <td>${travellersDto.getDestination()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
