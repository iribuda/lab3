<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All Aviatickets</title>
</head>
<body>

<h1>Aviatickets List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Place</th>
        <th>Flight</th>
        <th>Class Avia</th>
    </tr>

    <c:forEach var="aviaticket" items="${aviatickets}">
        <tr>
            <td>${aviaticket.id}</td>
            <td>${aviaticket.place}</td>
            <td>${aviaticket.tourFlight}</td>
            <td>${aviaticket.classAvia}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
