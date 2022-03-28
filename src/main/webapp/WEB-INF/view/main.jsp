<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: moon
  Date: 28.03.2022
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row">
        <h2>Добро пожаловать, работник!</h2>
        <security:authorize access="isAnonymous()">
            <a href="/login">Аутентификация</a>
        </security:authorize>
    </div>

    <security:authorize access="hasRole('ZAM')">
    <div class="row">
        <div class="col-md-6">
            <h3>Меню замдиректора</h3>
            <a href="/zam/tourtasks/add">Сформировать задание на составление тура</a>
            <br>
            <a href="/zam/positions/add">Учредить должность в фирме</a>
            <br>
            <a href="/zam/employees/add">Принять сотрудника на работу</a>
            <br>
        </div>
        <div class="col-md-6">
            <h3>Меню редактора тура</h3>
            <a href="/zam/tours">Список туров</a>
            <br>
        </div>
    </div>
    </security:authorize>

    <security:authorize access="hasRole('TOURMAKER')">
        <div class="row">
            <div class="col-md-6">
                <h3>Личный кабинет</h3>
                <a href="/tourmaker/tourtasks">Задания</a>
                <br>
            </div>
            <div class="col-md-6">
                <a href="/tourmaker/tours">Список туров</a>
                <br>
            </div>
        </div>
    </security:authorize>

    <security:authorize access="hasRole('TOURMANAGER')">
        <div class="row">
            <div class="col-md-6">
                <a href="/tourmanager/tours">Список туров</a>
                <br>
            </div>
        </div>
    </security:authorize>

    <security:authorize>
        <div class="row">
            <div class="col-md-6">
                <a href="/sales/programs">Список туров</a>
                <br>
                <a href="/sales/contracts">Список договоров</a>
                <br>
                <a href="/sales/hotels">Список гостиниц</a>
                <br>
            </div>
        </div>
    </security:authorize>
</div>

</body>
</html>
