<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>REG</p>
    <c:if test="${not empty message}"><div class="message green">${message}</div></c:if>
    <form:form action="/carSaleWebsite_war_exploded/reg" method="post" modelAttribute="userDto">

        <label for="nameInput">Name: </label>
        <form:input path="name" id="nameInput" />
        <form:errors path="name" cssClass="error" />
        <br/>

        Surname:<form:input path="surname"/>     <br>

        <form:select path="country">
            <form:option value="-" label="--Please Select" />
            <form:options items="${country}" itemValue="code" itemLabel="name" />
        </form:select>    <br>

        <label for="phoneInput">Phone: </label>
        <form:input path="phone" id="phoneInput" />
        <form:errors path="phone" cssClass="error" />
        <br/>

        <label for="dateInput">Birthday: </label>
        <form:input path="date" id="dateInput" placeholder="MM/DD/YYYY" />
        <form:errors path="date" cssClass="error" />
        <br/>

        Email:<form:input path="email"/>     <br>
        Password:<form:password path="password"/>     <br>
        Confirm:<form:password path="confirmPassword"/>     <br>
        М:<form:radiobutton path="gender" value="true"/>
        Ж:<form:radiobutton path="gender" value="false"/>     <br>
        Подписка на рассылку:<form:checkbox path="subscription" />
        <form:button>Submit</form:button>
    </form:form>
</body>
</html>
