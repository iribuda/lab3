<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All tour types</title>
</head>
<body>

<h1>tour types List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>

    <c:forEach var="tourType" items="${tourTypes}">
        <tr>
            <td>${tourType.id}</td>
            <td>${tourType.tour_type}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
