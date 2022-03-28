<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add Room</title>
</head>
<body>

<h1>New Room</h1>

<form:form action="zam/tourtasks" modelAttribute="tourTask">

    <form:hidden path="id"/>

    <br><br>
    Employee <form:input path="employee"/>
    <br><br>
    Tour <form:input path="tour"/>
    <br><br>
    Description <form:input path="description"/>
    <br><br>
    Execution time <form:input type="date" path="executionTime"/>
    <br><br>
    Status <form:input path="status"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
