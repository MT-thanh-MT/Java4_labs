<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  <title>Bai 2</title>
</head>
<body>

<div class="container">
  <header class="row">
    <div class="col-sm-6 ">
      <p class="fs-1 fw-bold text-success">Online Shopping Maill</p>
    </div>
    <div class="col-sm-6">
      <img src="images/mainLogo.png" alt="logo" class="float-end">
    </div>

  </header>
  <%@include file="views/menu.jsp"%>
  <div class="row mt-4 mb-4">
    <h2>User Management</h2>
    <div class="col-sm-6 mt-2 mb-4 My-form">
      <jsp:include page="views/form.jsp"></jsp:include>
    </div>
    <hr>
    <hr>
    <div class="col-sm-12 My-table">
      <jsp:include page="views/table.jsp">
        <jsp:param name="list" value="${ form }"/>
      </jsp:include>
    </div>
  </div>
  <footer class="text-center border border-3 rounded-2 pt-2">
    <p> FPT Polytechnic &copy;2022. All rights reseved.</p>
  </footer>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>