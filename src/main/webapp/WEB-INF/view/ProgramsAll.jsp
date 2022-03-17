<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All programs</title>
</head>
<body>

<h1>program List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Program number</th>
        <th>Description</th>
    </tr>

    <c:forEach var="program" items="${programs}">
        <tr>
            <td>${program.id}</td>
            <td>${program.program_number}</td>
            <td>${program.description}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
