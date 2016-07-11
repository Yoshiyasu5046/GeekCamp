<%@page import = "jums.JumsHelper" %>
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
        <title>JUMS登録確認画面</title>
    </head>
    
    <%
//        UderDataBeansのインスタンス生成
        UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
        
        // dayCheckがtrueの場合のみ57行目のif文の内部処理が実行される。
        boolean dayCheck = false;
        
        // フォームから入力された場合が2月の時。
        if (Integer.parseInt(udb.getMonth()) == 2) {
            // 閏年の2月の日にち選択の処理。
            if (JumsHelper.getInstance().LeapYear(Integer.parseInt(udb.getYear()))) {
                // 閏年のため、30日と31日を選択できなくするための処理
                if (Integer.parseInt(udb.getDay()) > 29) {
                    out.println("入力された日にちが正しくありません。この年は閏年のため、30日と31日は選択できません。");
                } else {
                    dayCheck = true;
                }
            // 閏年でない2月の日にち選択の処理。
            } else {
                // 29,30,31日を選択できなくするための処理。 
                if (Integer.parseInt(udb.getDay()) > 28) {
                    out.println("入力された日にちが正しくありません。この年は閏年でないため、29日、30日、31日は選択できません。");
                } else {
                    dayCheck = true;
                }
            }
        // 2月以外の月の処理
        } else {
                // 4,6,9,11月は31日がないため、31日を選択できないようにする処理。
                if (Integer.parseInt(udb.getMonth()) == 4 || Integer.parseInt(udb.getMonth()) == 6 || Integer.parseInt(udb.getMonth()) == 9 || Integer.parseInt(udb.getMonth()) == 11) {
                    if (Integer.parseInt(udb.getDay()) > 30) {
                        out.println("入力された日にちが正しくありません。この月は31日を選択できません。");
                    } else {
                        dayCheck = true;
                    }
                // 1,3,5,7,8,12月は31日が存在するため、日にち選択の制限を一切設けていない。
                } else {
                    dayCheck = true;
                } 
        } 
    %>

<!--    <%-- else { --%> このelseの書き方だとエラーが出てしまう。なぜ？-->
    
        <% 
            if (dayCheck == true) { %>
     
        <!-- 課題3 UserDataBeansからデータを使用。-->
        <h1>登録確認</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= udb.getType()%>　
        
<!--    種別を確認するために、helperクラスからtypeConfirmを呼び出した。-->
        <%= JumsHelper.getInstance().typeResultConfirm(udb.getType())%>
        
        <br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
            <!--課題2:　直リンクを防止するためにフォームで乱数を送信-->
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        </form>
    
<!--     62行目のdayCheckを閉じる-->
     <% } %>
        
     
        <!-- 課題2　直リンク防止のための処理-->
        <form action="insert" method="POST">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>"> 
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
<!--        課題1　ホーム画面に戻る処理-->
        <%=JumsHelper.getInstance().home()%>
</html>        

