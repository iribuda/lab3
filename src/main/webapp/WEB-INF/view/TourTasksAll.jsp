<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All tour tasks</title>
</head>
<body>

<h1>tour task List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Employee</th>
        <th>Tour</th>
        <th>Description</th>
        <th>Execution time</th>
        <th>Status</th>
    </tr>

    <c:forEach var="tourTask" items="${tourTasks}">
        <tr>
            <td>${tourTask.id}</td>
            <td>${tourTask.employee}</td>
            <td>${tourTask.tour}</td>
            <td>${tourTask.description}</td>
            <td>${tourTask.executionTime}</td>
            <td>${tourTask.status}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
