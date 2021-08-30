<%--
  Created by IntelliJ IDEA.
  User: ilnaz
  Date: 29.08.2021
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <p>_____W A Y 1_____</p>
    <form action="/carSaleWebsite_war_exploded/test" method="post">
        <input type="text" name="login">
        <input type="text" name="password">
        М:<input type="radio" name="gender" value="true">
        Ж:<input type="radio" name="gender" value="false">
        Подписка:<input type="checkbox" name="subscription">
        <input type="submit">
    </form>

    <p>_____W A Y 2_____</p>
    <form:form action="/carSaleWebsite_war_exploded/test2"
               method="post" modelAttribute="userDto">
        <form:input path="login"/>
        <form:password path="password"/>
        М:<form:radiobutton path="gender" value="true"/>
        Ж:<form:radiobutton path="gender" value="false"/>
        Подписка на рассылку:<form:checkbox path="subscription" />
        <form:button>Submit</form:button>
    </form:form>

    ModelMap msg: ${test}

</body>
</html>
