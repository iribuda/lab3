<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All Avia Tickets</title>
</head>
<body>

<h1>Avia Tickets List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Place</th>
        <th>Flight</th>
        <th>Class Avia</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="aviaticket" items="${aviatickets}">
        <c:url var="updateButton" value="/aviatickets/update">
            <c:param name="id" value="${aviaticket.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/aviatickets/delete">
            <c:param name="id" value="${aviaticket.id}"/>
        </c:url>
        <tr>
            <td>${aviaticket.id}</td>
            <td>${aviaticket.place}</td>
            <td>${aviaticket.tourFlight}</td>
            <td>${aviaticket.classAvia}</td>
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
