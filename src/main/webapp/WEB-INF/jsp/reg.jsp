<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>REG</p>
    <form action="/carSaleWebsite_war_exploded/reg" method="post">
        <input type="text" name="login">
        <input type="text" name="password">
        <input type="submit">
    </form>
</body>
</html>
