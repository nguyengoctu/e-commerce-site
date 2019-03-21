<%--
  Created by IntelliJ IDEA.
  User: ngoctu
  Date: 20/03/19
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/home" id="home">Online Shopping</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <%--<li class="nav-item active" id="home">--%>
                    <%--<a class="nav-link" href="${pageContext.request.contextPath}/home">Home--%>
                        <%--&lt;%&ndash;<span class="sr-only">(current)</span>&ndash;%&gt;--%>
                    <%--</a>--%>
                <%--</li>--%>
                <li class="nav-item" id="products">
                    <a class="nav-link" href="${pageContext.request.contextPath}/products">Products</a>
                </li>

                <li class="nav-item" id="about">
                    <a class="nav-link" href="${pageContext.request.contextPath}/about">About</a>
                </li>

                <li class="nav-item" id="contact">
                    <a class="nav-link" href="${pageContext.request.contextPath}/contact">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
