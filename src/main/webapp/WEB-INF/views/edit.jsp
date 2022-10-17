<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/10/2022
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/update" modelAttribute="customerUpdate" method="post">
    <form:input path="id" type="hidden"/>
    <form:input path="name" type="text"/>
    <button type="submit">Up Det</button>
</form:form>
</body>
</html>
