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

<h1>tours List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Status</th>
        <th>Tour number</th>
        <th>Tour type</th>
        <th>Country</th>
        <th>Start date</th>
        <th>End date</th>
        <th>Program number</th>
    </tr>

    <c:forEach var="tour" items="${tours}">
        <tr>
            <td>${tour.id}</td>
            <td>${tour.name}</td>
            <td>${tour.status}</td>
            <td>${tour.tour_number}</td>
            <td>${tour.tourType}</td>
            <td>${tour.country}</td
            <td>${tour.start_date}</td>
            <td>${tour.end_date}</td>
            <td>${tour.program}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
