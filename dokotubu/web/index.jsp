<%-- 
    Document   : index
    Created on : Jul 18, 2016, 2:57:43 PM
    Author     : yoshiyasukitahara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>どこつぶ</title>
    </head>
    <body>
        <h1>どこつぶへようこそ！</h1>
        <form action="/login.java" method ="post">
            ユーザー名:<input type="text" name="name"><br>
            パスワード:<input type="password" name="password"><br>
            <input type="submit" value="ログイン">
        </form>
    </body>
</html>
