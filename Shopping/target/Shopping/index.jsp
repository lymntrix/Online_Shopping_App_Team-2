<%--
    Document   : index
    Created on : Jun 19, 2021, 12:57:41 AM
    Author     : fahima
--%>

<%@page import="com.example.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home-Page</title>
        <%@include file="components/common_css_js.jsp"%>
    </head>
    <body>
     <%@include file="components/header.jsp"%>

        <h1>Hello World!</h1>
        <h1>Creating Session factory Object</h1>
        <%
            out.println(FactoryProvider.getFactory()+"<br>");
            out.println(FactoryProvider.getFactory()+"<br>");
            out.println(FactoryProvider.getFactory());
        %>

     <%@include file="components/footer.jsp" %>
    </body>
</html>
