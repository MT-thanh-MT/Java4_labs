<%--
  Created by IntelliJ IDEA.
  User: XUÂN THÀNH
  Date: 18/07/2022
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<form class="border border-3 rounded-2 p-4">
    <div class="mb-3">
        <label for="UserName" class="form-label">Username</label>
        <input type="text" class="form-control" id="UserName" name="username">
    </div>
    <div class="mb-3">
        <label for="Pass" class="form-label">Password</label>
        <input type="password" class="form-control" id="Pass" name="password">
    </div>
    <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="chkRemember" name="chkRemember">
        <label class="form-check-label" for="chkRemember">Remember me?</label>
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
</form>
