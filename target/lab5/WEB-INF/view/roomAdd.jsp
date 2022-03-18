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

<form:form action="" modelAttribute="room">

    <form:hidden path="id"/>

    Hotel <form:input path="hotel"/>
    <br><br>
    Place in hotel <form:input path="place_in_hotel"/>
    <br><br>
    Arrival date <form:input path="arrival_date"/>
    <br><br>
    Departure date <form:input path="departure_date"/>
    <br><br>
    Category <form:input path="category"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
