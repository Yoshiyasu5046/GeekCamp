<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "jums.JumsHelper"%>
<% JumsHelper jh = JumsHelper.getInstance();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error</title>
    </head>
    <body>
        エラーが発生しました。以下の項目を確認してください。<br>
        <%=request.getAttribute("error")%>
        <br>
        <%=jh.home()%>
    </body>
</html>
