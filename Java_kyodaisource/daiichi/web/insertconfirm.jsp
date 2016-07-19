<%@page import = "jums.JumsHelper" %>
<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import = "java.io.PrintWriter" %>

<%
    JumsHelper jh = JumsHelper.getInstance();

    HttpSession hs = request.getSession();
    // UderDataBeansのインスタンス生成
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
    
    // dayCheckがtrueの場合のみ18行目以下が実行される。   
    boolean finalCheck = true;
    String outputDayCheck = jh.dayCheck(udb.getYear(), udb.getMonth(), udb.getDay());
    String checkInput = jh.chkinput(udb.chkproperties());
    String ultimateCheck = jh.finalInputCheck(finalCheck, udb, outputDayCheck, checkInput); 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <%          
        if (ultimateCheck != null) {
            out.println(ultimateCheck);
        } else {             
    %>
        <!-- 課題3 UserDataBeansからデータを使用。-->
        <h1>登録確認</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= jh.typeConfirm(udb.getType())%>
        
        <br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
            <!--課題2:　直リンクを防止するためにフォームで乱数を送信-->
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        </form>
    
<!--     15行目のdayCheckを閉じる-->
        <% } %>
     
        <!-- 課題2　直リンク防止のための処理 ここで乱数を送る必要はない。-->
        <form action="insert" method="POST">
            <input type="hidden" name="mode" value="REINPUT"> 
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
<!--        課題1　ホーム画面に戻る処理-->
        <%=jh.home()%>
</html>        

