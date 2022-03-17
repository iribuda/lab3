<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All hotels</title>
</head>
<body>

<h1>hotels List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>City</th>
        <th>Name</th>
        <th>Tour</th>
    </tr>

    <c:forEach var="hotel" items="${hotels}">
        <tr>
            <td>${hotel.id}</td>
            <td>${hotel.city}</td>
            <td>${hotel.name}</td>
            <td>${hotel.tour}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
