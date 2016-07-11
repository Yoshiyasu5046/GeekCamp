//        // 課題4　フォーム　未入力チェック 注：もっと綺麗に書けそう。helperクラスに書くべき？
//        if (udb.getName().isEmpty()
//            || udb.getYear().isEmpty()
//            || udb.getMonth().isEmpty()
//            || udb.getDay().isEmpty()
//            || udb.getTell().isEmpty()
//            || udb.getComment().isEmpty()
//            ) {
//            //課題４ 入力されていない情報を通知
//            try{
//                if(udb.getName().equals("")){out.println("名前が入力されていません<br>");}
//                if(udb.getYear().equals("")){out.println("年が選択されていません<br>");}
//                if(udb.getMonth().equals("")){out.println("月が選択されていません<br>");}
//                if(udb.getDay().equals("")){out.println("日にちが選択されていません<br>");}
//                if(udb.getType().equals("")){out.println("種別が選択されていません<br>");}  
//                if(udb.getTell().equals("")){out.println("電話番号が入力されていません<br>");}
//                if(udb.getComment().equals("")){out.println("自己紹介が入力されていません<br>");}
//            } catch(NullPointerException e) {} // ""ではなくnullが格納されていた場合の例外処理。
//        } else { 
//      上の全ての要素が空でない場合、elseが実行される。このelseは68行目で閉じられる。

// 閏年と31日がない月の日時表示のためのコード
        if (monthI == 2) {
            if (JumsHelper.getInstance().LeapYear(yearI)) {
                for(dayI = 1; dayI<=29; dayI++){ %> 
                            <option value="<%=dayI%>" <%if(udb.getDay().equals(String.valueOf(dayI))){out.print("selected");}%>> <%=dayI%> </option>  
             <% } %>
         <% } else {
                for(dayI = 1; dayI<=28; dayI++){ %> 
                    <option value="<%=dayI%>" <%if(udb.getDay().equals(String.valueOf(dayI))){out.print("selected");}%>> <%=dayI%> </option>
            <%  } %>     
         <% }       
        } else {
                if (monthI == 4 || monthI == 6 || monthI == 9 || monthI == 11) {
                    for(dayI = 1; dayI<=30; dayI++){ %>
                        <option value="<%=dayI%>" <%if(udb.getDay().equals(String.valueOf(dayI))){out.print("selected");}%>> <%=dayI%> </option>
                 <% } %> 
             <% } else {
                    for(dayI = 1; dayI<=31; dayI++){ %>
                        <option value="<%=dayI%>" <%if(udb.getDay().equals(String.valueOf(dayI))){out.print("selected");}%>> <%=dayI%> </option>
                 <% } 
                }
        }