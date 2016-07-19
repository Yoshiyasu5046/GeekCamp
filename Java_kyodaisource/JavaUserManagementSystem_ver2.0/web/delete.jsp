<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO"
        import="jums.UserDataBeans"%>

<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans) session.getAttribute("DeleteUdb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>削除確認</h1>
        以下の内容を削除します。よろしいですか？
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getBirthday()%><br>
        種別:<%= jh.typeConfirm(udb.getType())%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        登録日時:<%= udb.getNewDate()%><br>

        <form action="DeleteResult" method="POST">
          <input type="submit" name="YES" value="はい" style="width:70px">
          <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
          <input type="hidden" name="ac"  value="<%= udb.getUserID()%>">
        </form><br>
        <form action="<%= session.getAttribute("to_resultDetail")%>" method="POST">
            <input type="submit" name="back_to_resultDetail" value="いいえ" style="width:70px">
            <input type="hidden" name="ac" value="">
        </form><br><br>
        <%=jh.home()%>
    </body>
</html>
