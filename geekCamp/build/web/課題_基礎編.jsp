<%-- 
    Document   : 課題_基礎編
    Created on : Jun 6, 2016, 2:53:11 PM
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
        <h1>課題_基礎編 Java1</h1>
        <%
            // 1. 「Hello world.」を表示
            out.print("Hello world.");
            out.print("<br>");

            // 2. 「groove」「-」「gear」の３つの文字列を連結して表示
            out.print("groove" + "-" + "gear");
            out.print("<br>");

            // 3. 自分の自己紹介を作成
            String name = "北原吉泰。";
            String job = "学生です。";
            out.print("自己紹介：" + name + job);
            out.print("<br>");

            // ４．定数と変数を宣言し、それぞれに数値を入れて四則演算を行ってください。
            int num1 = 3;
            final int num2 = 5;
            int result = num1 * num2; 
            out.print(result);
            out.print("<br>");

            // ５．四則演算の結果をそれぞれ表示してください。
            num1 = 8;
            int result2 = num1 * num2;
            out.print(result2);
            out.print("<br>");

            //６．変数を宣言し、その変数の中身によって以下の表示を行ってください。
            // 　　　⇒値が 1 なら「１です！」
            // 　　　⇒値が 2 なら「プログラミングキャンプ！」
            // 　　　⇒それ以外なら「その他です！」
            int number = 4;
            if (number == 1) {
                    out.print("１です！");
            } else if (number == 2) {
                    out.print("プログラミングキャンプ！");
            } else {
                    out.print("その他です！");
            }
        %>

    </body>
</html>
