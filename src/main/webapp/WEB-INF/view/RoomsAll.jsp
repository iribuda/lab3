<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All rooms</title>
</head>
<body>

<h1>rooms List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Hotel</th>
        <th>Place in hotel</th>
        <th>Arrival date</th>
        <th>Departure date</th>
        <th>Category</th>
    </tr>

    <c:forEach var="room" items="${rooms}">
        <tr>
            <td>${room.id}</td>
            <td>${room.hotel}</td>
            <td>${room.place_in_hotel}</td>
            <td>${room.arrival_date}</td>
            <td>${room.departure_date}</td>
            <td>${room.category}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
