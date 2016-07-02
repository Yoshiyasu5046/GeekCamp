<%-- 
    Document   : result
    Created on : Jun 28, 2016, 2:29:08 PM
    Author     : Yoshiyasu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Arrays" %>


<!DOCTYPE html>
<html>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>内容確認</title>
    
    <body>
        <h1>内容確認</h1>
        <%
            //文字コード
            request.setCharacterEncoding("UTF-8");

            //データの受け取り
            String name = request.getParameter("txtName");
            String gender = request.getParameter("gender");
            String hobby = request.getParameter("hobby");
            out.print(name);
            out.print("<br>");
            out.print(gender);
            out.print("<br>");
            out.print(hobby);
            
            // ユーザー1回目の訪問
            Date time = new Date();
            SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String strTime = f.format(time);
            out.println("<br>");
            out.println(strTime);
            
            // Cookieの設定
            Cookie c = new Cookie("LastLogin", strTime);
            response.addCookie(c);

            // Cookieによる次回以降の訪問
            Cookie cookie_result[] = request.getCookies();
            out.println("<br>");
            
            if(cookie_result != null) {
                 for(int i = 0; i < cookie_result.length; i++) {
                     out.println("<br>");
                     if(cookie_result[i].getName().equals("LastLogin")) {
                        out.println("クッキーでの最後のログインは、" + cookie_result[i].getValue());
                        break;
                     }
                 }
             }
            
            // セッションの設定
            HttpSession hs = request.getSession(false);
            if (hs == null) {
                hs.setAttribute("LastLogin", strTime);
            }else {
                out.println("<br>");
                long accessTime = session.getLastAccessedTime();
                Date accessDate = new Date(accessTime);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String hsTime = sdf.format(accessDate);
                out.println("セッションでの最後のログインは" + hsTime);
            }
              
        %>
    </body>
</html>
