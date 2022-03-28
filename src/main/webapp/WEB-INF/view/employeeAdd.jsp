<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add employee</title>
</head>
<body>

<h1>New Employee</h1>

<%--@elvariable id="employee" type=""--%>
<form:form action="zam/employees" modelAttribute="employee">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Position <form:input path="position"/>
    <br><br>
    Passport number <form:input path="passport_number"/>
    <br><br>
    Address <form:input path="address"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
