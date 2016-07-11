<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    <body>
    <!-- 課題3　UserDataBeansからデータを使用-->
        <% UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");%>
        <h1>登録結果</h1><br>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= udb.getType()%>
        <%
        if(udb.getType().equals("1")){out.println("エンジニア");} // リファクトできそう
        else if(udb.getType().equals("2")){out.println("営業");} 
        else if(udb.getType().equals("3")){out.println("その他");}
        else {out.print("種別が正しく選択されていません。");}
        %>
        <br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        以上の内容で登録しました。<br>
        <%=JumsHelper.getInstance().home()%>
    </body>
    <%--課題7　セッションクリア --%>
        <%session.invalidate();%>
</html>
