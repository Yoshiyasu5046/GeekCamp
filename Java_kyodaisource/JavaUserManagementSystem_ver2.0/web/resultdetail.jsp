<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataBeans" %>

<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("resultData");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMSユーザー情報詳細画面</title>
    </head>
    <body>
        
        <h1>詳細情報</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getBirthday()%><br>
        種別:<%= jh.typeConfirm(udb.getType())%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        登録日時:<%= udb.getNewDate()%><br>
        
        
        <form action="Update" method="POST">
            <input type="submit" name="update" value="変更" style="width:100px">
            <input type="hidden" name="ac" value="<%= hs.getAttribute("ac")%>">
        </form>
        
        <form action="Delete" method="POST">
            <input type="submit" name="delete" value="削除" style="width:100px">
            <input type="hidden" name="ac" value="<%= hs.getAttribute("ac")%>">
        </form>
        <br>
        <form action="<%= session.getAttribute("to_searchResult")%>" method="POST">
        <input type="submit" name="back_to_resultDetail" value="検索結果ページへ" style="width:100px">
        <input type="hidden" name="ac" value="<%= hs.getAttribute("ac")%>">
    </form><br>
        <%=jh.home()%>
    </body>
</html>
