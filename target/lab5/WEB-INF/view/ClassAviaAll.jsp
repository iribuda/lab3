<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All class avia</title>
</head>
<body>

<h1>class avia List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="classAvia" items="${classesAvia}">
        <c:url var="updateButton" value="/classAvias/update">
            <c:param name="id" value="${classAvia.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/classAvias/delete">
            <c:param name="id" value="${classAvia.id}"/>
        </c:url>

        <tr>
            <td>${classAvia.id}</td>
            <td>${classAvia.classAvia}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>

</table>

<input type="button" value="Add"
       onclick="window.location.href='add'">

</body>
</html>
