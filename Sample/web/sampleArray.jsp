<%-- 
    Document   : sampleArray
    Created on : Jul 12, 2016, 11:21:06 AM
    Author     : yoshiyasukitahara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 1; i < 5; i++) {
        al.add(i);
    }

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for (int i = 0 ; i < al.size(); i++) {
                out.println(al.get(i));
            }
        %>
    </body>
</html>

    
