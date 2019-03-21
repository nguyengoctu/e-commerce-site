<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: ngoctu
  Date: 21/03/19
  Time: 01:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="my-4">Shop Name</h1>
<div class="list-group">
    <c:forEach items="${categories}" var="category">
        <a href="${pageContext.request.contextPath}/category/${category.id}/products" class="list-group-item" id="${fn:replace(category.name, ' ', '')}">${category.name}</a>
    </c:forEach>
</div>