<%--
  Created by IntelliJ IDEA.
  User: TungDao
  Date: 10/17/2022
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" style="width: 100%">
    <tr>
        <th>STT</th>
        <th>NAME</th>
        <th>EDIT</th>
        <th>XOA</th>
    </tr>
    <c:forEach var="ctm" items="${listCustomer}">
        <tr>
            <td>${ctm.id}</td>
            <td><a href="/detail/${ctm.id}">${ctm.name}</a></td>
            <td><a href="/show/update/${ctm.id}">Edit</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>