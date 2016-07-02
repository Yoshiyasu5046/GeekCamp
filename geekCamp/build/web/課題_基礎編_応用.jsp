<%-- 
    Document   : 課題_応用
    Created on : Jun 6, 2016, 3:57:46 PM
    Author     : Yoshiyasu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>課題_応用7 Java1</title>
    </head>
    <body>
        <% 
            String total_amount = request.getParameter("total_amount");
            String num_pcs = request.getParameter("num_pcs");
            String goods_id = request.getParameter("goods_id");
            
            if (goods_id == "雑貨") {
                out.print(1); 
                out.print("<br>");
            } else if (goods_id == "生鮮食品") {
                out.print(2);
                out.print("<br>");
            } else if (goods_id == "その他") {
                out.print(3);
                out.print("<br>");
            }
            
            int total = Integer.parseInt(total_amount);
            int lot = Integer.parseInt(num_pcs);
            int unit = total / lot;
            out.print("単価は"+unit);
            out.print("<br>");
            
            if (total >= 3000 && total < 5000) {
                double point = total * 0.04;
                out.print("ポイントは" + point);
                out.print("<br>");
            } else if (total >= 5000) {
                double point = total * 0.05;
                out.print("ポイントは" + point);
                out.print("<br>");
            }
            
        %>
        
    </body>
</html>
