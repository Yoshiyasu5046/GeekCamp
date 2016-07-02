<%-- 
    Document   : 課題_基礎編
    Created on : Jun 28, 2016, 1:52:09 PM
    Author     : Yoshiyasu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SelfIntroduction</title>
    </head>
    <body>
        <h1>自己紹介</h1>
        <form action="http://localhost:8084/Java_DataOperation/result.jsp" method="post">
        <p>ID:<input type="text" name="txtName"></p>
        
        <p>
        性別:<input type="radio" name="gender" value="male">男
        <input type="radio" name="gender" value="female">女    
        </p>
        <p>趣味<br>
            <textarea name="hobby" cols="30" rows="5"></textarea>
        </p>
        <input type="submit" value="送信する"> 
        
        <%
            HttpSession hs = request.getSession(false);
            if (hs == null) {
                hs.setAttribute("txtName", "txtName");
                hs.setAttribute("gender", "gender");
                hs.setAttribute("hobby", "hobby");
            }else {
                out.println("<br>");
                Object name = hs.getAttribute("txtName");
                Object gender = hs.getAttribute("txtName");
                Object hobby = hs.getAttribute("txtName");
            }
        %>
        <p>前回の入力内容
<!--            <input type="text" name=name>
            <input type="text" name=gender>
            <input type="text" name=hobby>
        -->
        </p>
    </body>
</html>
