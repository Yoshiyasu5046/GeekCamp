<%@page import="jums.JumsHelper" 
        import="jums.UserDataBeans" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataBeans udb = (UserDataBeans) request.getAttribute("udb");
    String referer = (String) request.getAttribute("to_resultDetail");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        <h1>変更結果</h1><br>
        名前:<%=udb.getName()%><br>
        生年月日:<%=udb.getYear() + "年" + udb.getMonth() + "月" + udb.getDay() + "日"%><br>
        種別:<%= jh.typeConfirm(udb.getType())%><br>
        電話番号:<%=udb.getTell()%><br>
        自己紹介:<%=udb.getComment()%><br><br>
        以上の内容で更新しました。<br><br>
        
        <form action="<%= referer%>" method="POST">
            <input type="submit" name="back_to_resultDetail" value="詳細情報ページへ">
            <input type="hidden" name="ac" value="">
        </form>
        <br><br>
        <%=jh.home()%>
    </body>    
</html>
