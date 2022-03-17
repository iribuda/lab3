<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All orders</title>
</head>
<body>

<h1>orders List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Order number</th>
        <th>Tour</th>
        <th>Employee</th>
    </tr>

    <c:forEach var="order" items="${orders}">
        <tr>
            <td>${order.id}</td>
            <td>${order.order_number}</td\
            <td>${order.tour}</td>
            <td>${order.employee}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
