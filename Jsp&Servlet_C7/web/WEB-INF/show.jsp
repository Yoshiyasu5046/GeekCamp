<%-- 
    Document   : show
    Created on : Jul 6, 2016, 5:51:01 PM
    Author     : yoshiyasukitahara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.Fruit" %>
<% Fruit f = (Fruit) request.getAttribute("f"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fruit</title>
    </head>
    <body>
        <h1>Fruits!</h1>
        <p><%= f.getName() %>の値段は<%= f.getPrice() %>円です。</p>
    </body>
</html>
