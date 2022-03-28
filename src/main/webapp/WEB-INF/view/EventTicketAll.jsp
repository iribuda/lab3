<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All event tickets</title>
</head>
<body>

<h1>event tickets List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Event</th>
        <th>Place</th
        <th>Operations</th>
    </tr>

    <c:forEach var="eventTicket" items="${eventTickets}">
        <c:url var="updateButton" value="/eventTickets/update">
            <c:param name="id" value="${eventTicket.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/eventTickets/delete">
            <c:param name="id" value="${eventTicket.id}"/>
        </c:url>
        <tr>
            <td>${eventTicket.id}</td>
            <td>${eventTicket.event}</td>
            <td>${eventTicket.place}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>

</table
<input type="button" value="Add"
       onclick="window.location.href='add'">

</body>
</html>
