<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All tour flights</title>
</head>
<body>

<h1>tour flights List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Flight number</th>
        <th>Tour</th>
        <th>Air company</th>
        <th>Departure date</th>
        <th>Departure time</th>
        <th>Departure city</th>
        <th>Arrival city</th>
        <th>Direction</th>
    </tr>

    <c:forEach var="tourFlight" items="${tourFlights}">
        <tr>
            <td>${tourFlight.id}</td>
            <td>${tourFlight.flight_number}</td>
            <td>${tourFlight.air_company}</td>
            <td>${tourFlight.departure_date}</td>
            <td>${tourFlight.departure_time}</td>
            <td>${tourFlight.departure_city}</td>
            <td>${tourFlight.arrival_city}</td>
            <td>${tourFlight.direction}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
