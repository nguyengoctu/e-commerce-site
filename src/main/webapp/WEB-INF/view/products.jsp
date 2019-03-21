<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: ngoctu
  Date: 21/03/19
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <div class="row">
        
        <%-- side bar --%>
        <div class="col-md-3">
            <%@include file="shared/sidebar.jsp"%>
        </div>
            
        <%-- products --%>
        <div class="col-md-9">
            <div class="row">
                <div class="col-lg-12">
                    <c:if test="${userClickProducts == true}">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                            <li class="breadcrumb-item active">All products</li>
                        </ol>
                    </c:if>

                    <c:if test="${userClickCategoryProducts == true}">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                            <li class="breadcrumb-item active">Products</li>
                            <li class="breadcrumb-item active">${category.name}</li>
                        </ol>
                    </c:if>
                </div>
            </div>
        </div>
    </div>
</div>
