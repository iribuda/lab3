<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All employees</title>
</head>
<body>

<h1>Employees List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Position</th>
        <th>Passport Number</th>
        <th>Address</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${emps}">

        <c:url var="updateButton" value="/employees/update">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/employees/delete">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.position.position}</td>
            <td>${emp.passport_number}</td>
            <td>${emp.address}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>

</table>

<br>

<input type="button" value="Add"
    onclick="window.location.href='add'">

</body>
</html>
