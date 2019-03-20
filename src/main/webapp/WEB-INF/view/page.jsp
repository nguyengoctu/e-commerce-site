<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page isELIgnored="false" %>

<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>


<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage - ${title}</title>
  <script>
    window.menubar = '${title}';
  </script>

  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${css}/shop-homepage.css" rel="stylesheet">

</head>

<body>
  <div class="wrapper">

    <!-- Navigation -->
    <%@include file="shared/navigation-bar.jsp" %>

    <!-- Page Content -->
    <div class="content">
      <c:if test="${userClickHome == true}">
        <%@include file="home.jsp" %>
      </c:if>

      <c:if test="${userClickAbout == true}">
        <%@include file="about.jsp" %>
      </c:if>

      <c:if test="${userClickContact == true}">
        <%@include file="contact.jsp" %>
      </c:if>
    </div>
    <!-- /.container -->

    <!-- Footer -->


    <%@include file="shared/footer.jsp" %>

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>
    <script src="${js}/myapp.js"></script>
  </div>
</body>

</html>
