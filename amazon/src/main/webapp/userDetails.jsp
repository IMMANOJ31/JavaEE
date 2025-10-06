<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored="false" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>

<h1>The list of users</h1>
<table>
    <tr>
        <th>Sl no.</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Phone number</th>
        <th>Gender</th>
        <th>Email</th>
    </tr>

    <c:forEach items="${listOfUsers}" var="dto" varStatus="status">
    <tr>
        <td>${status.index+1}</td>
        <td>${dto.getFirstName()}</td>
        <td>${dto.getLastName()}</td>
        <td>${dto.getPhoneNumber()}</td>
        <td>${dto.getGender()}</td>
        <td>${dto.getEmail()}</td>
    </tr>
    </c:forEach>

</table>
</body>
</html>




