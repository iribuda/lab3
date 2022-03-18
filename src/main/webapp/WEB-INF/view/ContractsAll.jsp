<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All contracts</title>
</head>
<body>

<h1>contracts List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Contract number</th>
        <th>Registration date</th>
        <th>Client</th>
        <th>Tour</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="contract" items="${contracts}">
        <c:url var="updateButton" value="/contracts/update">
            <c:param name="id" value="${contract.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/contracts/delete">
            <c:param name="id" value="${contract.id}"/>
        </c:url>
        <tr>
            <td>${contract.id}</td>
            <td>${contract.contractNumber}</td>
            <td>${contract.registrationDate}</td>
            <td>${contract.client}</td>
            <td>${contract.tour}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
             </td>

        </tr>
    </c:forEach>

</table
<input type="button" value="Add"
       onclick="window.location.href='add'">
</body>
</html>
