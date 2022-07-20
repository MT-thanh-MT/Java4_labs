<%--
  Created by IntelliJ IDEA.
  User: XUÂN THÀNH
  Date: 19/07/2022
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>User List</h3>
<table class="table table-bordered border-primary">
    <thead>
        <tr>
            <th scope="col">Username</th>
            <th scope="col">Password</th>
            <th scope="col">Remember?</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <th scope="row">${ user.username }</th>
                <td>${ user.password }</td>
                <td>${ user.remember ? 'Yes':'No' }</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
