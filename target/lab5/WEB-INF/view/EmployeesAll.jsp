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
    </tr>

    <c:forEach var="emp" items="${emps}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.position.position}</td>
            <td>${emp.passport_number}</td>
            <td>${emp.address}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
