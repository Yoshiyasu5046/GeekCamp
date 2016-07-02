<%-- 
    Document   : sampleCookie
    Created on : Jun 28, 2016, 3:21:38 PM
    Author     : Yoshiyasu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>クッキーテスト</h1>
    </body>
</html>

<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="java.util.Date" %>
<%
   // ユーザー1回目の訪問
//   Date time = new Date();
   Cookie c = new Cookie("LastLogin", "1");
   response.addCookie(c);
   
    // 次回以降の訪問
//   Cookie cs[] = request.getCookies();
//   if(cs != null) {
//       for(int i = 0; i < cs.length; i++) {
//           out.println("<br>");
//           out.println("最後のログインは、" + cs[i].getValue());
//           out.println(cs.toString());
//           break;
//       }
   


%>