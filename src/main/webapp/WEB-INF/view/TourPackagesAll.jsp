<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All tour packages</title>
</head>
<body>

<h1>tour package List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Tour package number</th>
        <th>Tourist</th>
        <th>Avia tickets</th>
    </tr>

    <c:forEach var="tourPackage" items="${tourPackages}">
        <tr>
            <td>${tourPackage.id}</td>
            <td>${tourPackage.tour_package_number}</td>
            <td>${tourPackage.tourist}</td
            <td>${tourPackage.aviaTickets}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
