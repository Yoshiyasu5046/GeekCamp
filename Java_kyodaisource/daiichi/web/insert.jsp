<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans"%>

<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
        名前:
        <input 
            type="text" 
            name="name" 
            required 
            value="<%try {if (udb.getName() != null) {out.print(udb.getName());}} catch (NullPointerException e) {}%>">
        <br><br>

        生年月日:　
        <%
            int yearI;
            int monthI;
            int dayI;
        %>
        <select name="year">
            <option value="">----</option>
            <%
            for(yearI=1950; yearI<=2010; yearI++){ %>
            <option value="<%=yearI%>" <%try{if(udb.getYear().equals(String.valueOf(yearI))){out.print("selected");}}catch(NullPointerException e){}%>><%=yearI%> </option>
            <% } %>
        </select>年
        <select name="month">
            <option value="">--</option>
            <%
            for(monthI = 1; monthI<=12; monthI++){ %>
            <option value="<%=monthI%>" <%try{if(udb.getMonth().equals(String.valueOf(monthI))){out.print("selected");}}catch(NullPointerException e){}%>><%=monthI%></option>
            <% } %>
        </select>月
        <!--31日がない月に31日が登録できないように処理-->
        <select name="day">
            <option value="">--</option>
            <%
            for(dayI = 1; dayI<=31; dayI++){ %>
            <option value="<%=dayI%>" <%try{if(udb.getDay().equals(String.valueOf(dayI))){out.print("selected");}}catch(NullPointerException e){}%>><%=dayI%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1" required <%try{if(udb.getType().equals("1")){out.print("checked");}}catch(NullPointerException e){}%>>エンジニア<br>
        <input type="radio" name="type" value="2" required <%try{if(udb.getType().equals("2")){out.print("checked");}}catch(NullPointerException e){}%>>営業<br>
        <input type="radio" name="type" value="3" required <%try{if(udb.getType().equals("3")){out.print("checked");}}catch(NullPointerException e){}%>>その他<br>
        <br>

        電話番号:
        <input 
            required
            type="text" 
            name="tell" 
            pattern="\d{3}-\d{3,4}-\d{4}" 
            title="電話番号は、半角で市外局番からハイフン（-）を入れて記入してください。" 
            maxlength="13" 
            value="<%try {if (udb.getTell() != null) {out.print(udb.getTell());}}catch(NullPointerException e) {}%>"
        >
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard" required>
            <%try {if (udb.getComment() != null) {out.print(udb.getComment());}} catch (NullPointerException e) {}%>
        </textarea>
        <br><br>
        
<!--        直リンク防止のために、乱数をフォームで送信-->
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
