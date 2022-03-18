<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All events</title>
</head>
<body>

<h1>events List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>City</th>
        <th>Place</th>
        <th>Start Time</th>
        <th>Tour</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="event" items="${events}">
        <c:url var="updateButton" value="/events/update">
            <c:param name="id" value="${event.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/events/delete">
            <c:param name="id" value="${event.id}"/>
        </c:url>
        <tr>
            <td>${event.id}</td>
            <td>${event.city}</td>
            <td>${event.place}</td>
            <td>${event.startTime}</td>
            <td>${event.tour}</td>
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
