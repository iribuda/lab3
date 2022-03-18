<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All tourists</title>
</head>
<body>

<h1>tourists List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
        <th>Age</th>
        <th>Passport Number</th>
    </tr>

    <c:forEach var="tourist" items="${tourists}">
        <tr>
            <td>${tourist.id}</td>
            <td>${tourist.name}</td>
            <td>${tourist.address}</td>
            <td>${tourist.age}</td>
            <td>${tourist.passport_number}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
