<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Bai 3</title>
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
        <h2>Chi tiết sản phẩm</h2><br>
        <div class="col-sm-6 mt-2 mb-4 My-detail">
            <div class="card">
                <div class="card-header fs-1">
                    ${item.name}
                </div>
                <div class="card-body text-center p-4">
                    <img src="images/${item.image}" class="card-img-top w-75" alt="..." width="20px">
                    <div class="mt-4 fs-3">
                        <li>Giá gốc: <strike>${ item.price }</strike></li>
                        <li>Giá mới:
                            <c:set var="newprice" value="${item.price*(1-item.discount)}"/>
                            <fmt:formatNumber value="${newprice}"/>
                        </li>
                        <li>Mức giá:
                            <c:choose>
                                <c:when test="${newprice < 10}">Giá thấp</c:when>
                            <c:when test="${newprice > 100}">Giá cao</c:when>
                            <c:otherwise>Bình thường</c:otherwise>
                            </c:choose>
                        </li>
                    </div>
                </div>
                <div class="card-footer text-muted">
                    ${item.date}
                </div>
            </div>
        </div>
        <div class="col-sm-6 mt-2 fs-2">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A architecto consectetur doloremque dolores ea, et, fugiat ipsa magni molestias non nulla numquam perspiciatis porro quis, sequi soluta voluptatibus. Blanditiis, porro.</p>
        </div>
    </div>
    <footer class="text-center border border-3 rounded-2 pt-2">
        <p> FPT Polytechnic &copy;2022. All rights reseved.</p>
    </footer>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>