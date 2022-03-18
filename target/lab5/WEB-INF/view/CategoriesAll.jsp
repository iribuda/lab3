<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All categories</title>
</head>
<body>

<h1>categories List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="category" items="${categories}">
        <c:url var="updateButton" value="/categories/update">
            <c:param name="id" value="${category.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/categories/delete">
            <c:param name="id" value="${category.id}"/>
        </c:url>
        <tr>
            <td>${category.id}</td>
            <td>${category.category}</td>
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
