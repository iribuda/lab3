<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All class hotel</title>
</head>
<body>

<h1>class hotel List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="classHotel" items="${classHotels}">
        <c:url var="updateButton" value="/classHotels/update">
            <c:param name="id" value="${classHotel.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/classHotels/delete">
            <c:param name="id" value="${classHotel.id}"/>
        </c:url>
        <tr>
            <td>${classHotel.id}</td>
            <td>${classHotel.classHotel}</td>
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
