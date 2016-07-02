<%-- 
    Document   : 課題_応用編
    Created on : Jun 7, 2016, 3:36:29 PM
    Author     : Yoshiyasu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Javaプログラミング　基礎学習2　課題（応用編）</h2>
        <%
//       10.クエリストリングを利用して、以下の処理を実現してください。
//          簡易素因数分解のロジックを作成します。クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
//          元の値と素因数分解の結果を表示するようにしてください。
//          2ケタ以上の素数が含まれた数値の場合は、「元の値　1ケタの素因数　その他」と表記して、その他　に含んでください。
            
            String numString = request.getParameter("numString");
            int num = Integer.parseInt(numString);
           
            if (num < 2) {
                out.println(num);
                out.println("<br>");
                out.println("素数ではない");
            } else if (num == 2) {
                out.println("元の値は" + num);
                out.println("<br>");
                out.println("素因数分解の結果は" + num);
            } else {
                for (int i = 2; i <= (num - 1); i++) {
                    if (num % i == 0) {
                        out.println(num);
                        out.println("<br>");
                        out.println("素数ではない");
                        break;
                    } else if (num > 10) {
                            out.println("「元の値　1ケタの素因数　その他」" + num + "はその他へ分類");
                            break;
                    } else {
                        out.println("元の値は" + num);
                        out.println("<br>");
                        out.println("素因数分解の結果は" + num);
                        break;
                    }
                }
            }    
        
        %>
    </body>
</html>
