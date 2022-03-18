<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add Position</title>
</head>
<body>

<h1>New Position</h1>

<form:form action="" modelAttribute="position">

    <form:hidden path="id"/>

    Place <form:input path="position"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
