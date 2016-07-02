<%-- 
    Document   : 課題_基礎編
    Created on : Jun 7, 2016, 1:29:14 PM
    Author     : Yoshiyasu
--%>

<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Javaプログラミング　基礎学習2 課題 基礎編</h2>
        <%@ page import="java.util.Random"%>
        <%@ page import="java.util.ArrayList"%>
        <%@ page import="java.util.HashMap"%>

        <%
//          １．switch文を利用して、以下の処理を実現してください。
//              値が1なら「one」、値が2なら「two」、それ以外は「想定外」と表示する処理
                out.println("1. switch文");
                out.println("<br>");
                Random rand = new Random(); // 乱数を作るためにランダムクラスを作成。
                int num = rand.nextInt(10);        
                switch(num) {
                    case 1:
                        out.println("one");
                        break;
                    case 2:
                        out.println("two");
                        break;
                    default:
                        out.println("想定外");
                        break;
                }
                out.println("<br>");
                out.println("<br>");        
        
//          ２．switch文を利用して、以下の処理を実現してください。
//             値が"A"なら「英語」、値が"あ"なら「日本語」、それ以外は何も表示しない処理
                out.println("2. Switch文");
                out.println("<br>");
                String input = "A";
                switch(input) {
                    case "A":
                        out.println("英語");
                        break;
                    case "あ":
                        out.println("日本語");
                        break;
                    default:
                        break;   
                }
                out.println("<br>");
                out.println("<br>");

//          ３．for文を利用して、8を20回掛ける処理を実現してください。
                out.println("3. for文を利用して、8を20回掛ける処理を実現してください。");
                int n = 1;
                for (long i = 8; n <= 20; i *= 8) {
                    out.println("<br>");
                    out.println(i);
                    n ++;
                }
                out.println("<br>");
                out.println("<br>");
                
                
//          ４．for文を利用して、"A"を30個連結する処理を実現してください。
                out.println("4. for文を利用して、'A'を30個連結する処理を実現してください。");
                out.println("<br>");
                int m = 1;
                for (String s = ""; m <= 30; m++) {
                    out.println(s + "A");
                }
                out.println("<br>");
                out.println("<br>");
                
//          ５．for文を利用して、0から100を全部足す処理を実現してください。
                out.println("5. for文を利用して、0から100を全部足す処理を実現");
                out.println("<br>");
                short j = 0;
                for (int i = 0; j <= 100; j++) {
                    i += (j + 1);
                    if (j == 100) {
                        out.println(i);
                    }
                }
                out.println("<br>");
                out.println("<br>");
                        
//          ６．while文を利用して、以下の処理を実現してください。
//             1000を2で割り続け、100より小さくなったらループを抜ける処理
                out.println("6. while文を利用して、1000を2で割り続け、100より小さくなったらループを抜ける処理の作成");
                out.println("<br>");
                int num1 = 1000;
                while (num1 > 100) {
                    out.println(num1);
                    num1 /= 2;
                }
                out.println("<br>");
                out.println("<br>");

//          ７．以下の順番で、要素が格納された配列を作成してください。
//             "10", "100", "soeda", "hayashi", "-20", "118", "END"
                out.println("7. 以下の順番で、要素が格納された配列を作成してください。");
                out.println("'10', '100', 'soeda', 'hayashi', '-20', '118', 'END'");
                out.println("<br>");
                String n_array[] = {"10","100","soeda","hayashi","-20","118","END"};
                out.println(n_array);
                out.println("<br>");
                out.println(Arrays.toString(n_array));
                out.println("<br>");
                out.println("<br>");
                
//          ８．７で作成した配列の"soeda"を"33"に変更してください。
                out.println("8. ７で作成した配列の'soeda'を33に変更");
                out.println("<br>");
                n_array[2] = "33";
                out.print(n_array);
                out.println("<br>");
                out.println(Arrays.toString(n_array));
                out.println("<br>");
                out.println("<br>");

//          ９．以下の順で、連想配列を作成してください。
//             "1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20"
                out.println("9. '1'に'AAA', 'hello'に'world', 'soeda'に'33', '20'に'20'");
                out.println("<br>");
                HashMap<String, String> sample_map = new HashMap<String, String>();
                sample_map.put("1", "AAA");
                sample_map.put("hello", "world");
                sample_map.put("soeda", "33");
                sample_map.put("20", "20");
                out.println(sample_map);
                out.println("<br>");
                out.println("<br>");
        
        %>
    </body>
</html>
