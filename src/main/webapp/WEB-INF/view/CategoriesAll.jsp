<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All categories</title>
</head>
<body>

<h1>categories List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>

    <c:forEach var="category" items="${categories}">
        <tr>
            <td>${category.id}</td>
            <td>${category.category}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>