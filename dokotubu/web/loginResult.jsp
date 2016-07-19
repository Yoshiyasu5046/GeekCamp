<%-- 
    Document   : loginResult
    Created on : Jul 18, 2016, 3:29:45 PM
    Author     : yoshiyasukitahara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.User" %>

<%
    // セッションスコープからユーザー情報を取得
    User loginUser = (User) session.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>どこつぶ</title>
    </head>
    <body>
        <h1>どこつぶログイン</h1>
    <% if(loginUser != null) { %>
        <p>ログインに成功しました</p>
        <p>ようこそ <%= loginUser.getUserName() %>さん </p>
        <a href ="/main">つぶやき投稿、閲覧へ</a>
    <% } else { %>
        <p>ログインに失敗しました</p>
        <a href="/index">トップへ</a>
    <% } %>
    </body>
</html>
