package jums;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 画面系の処理や表示を簡略化するためのヘルパークラスです。定数なども保存されます
 * @author hayashi-s
 */
public class JumsHelper {
    
    public static JumsHelper getInstance(){
        return new JumsHelper();
    }
    
    //トップへのリンクを定数として設定
    private final String homeURL = "index.jsp";
    
    //トップへのリンクを返却
    public String home(){
        return "<a href=\""+homeURL+"\">トップへ戻る</a>";
    }
    
//    public void typeChecker(String type) {
//        try{
//            if (udb.getType().equals(type)){ System.out.println("checked");}}
//        catch(NullPointerException e){}
//    }
        
 // 乱数比較をメソッドにまとめたい。だが今のところ使えない…
//    public void AccessChecker(HttpServletRequest request, HttpSession session, boolean shingi) {
//        // オーバライドする必要あり。ただオーバーライドすると余計複雑になる可能性が高い。 
//        String accesschk = request.getParameter("ac");
//        if(accesschk == null || (Integer)session.getAttribute("ac") != Integer.parseInt(accesschk)){
//            shingi = false;
//        }
//    }
    
    public boolean LeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public void daysInMonth(int year, int month, int i) {
        if (month == 2) {
            if (LeapYear(year)) {
                for(i = 1; i<=29; i++){ i = i;}
            } else {
                for(i = 1; i<=28; i++){ i = i;}
            }
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                for(i = 1; i<=30; i++){i = i;}
            } else {
                for(i = 1; i<=31; i++){i = i;}
            }
        }  
    }
    
    // elseの処理が上手くできないため、リファクトできない… 
    public String yearMonthDayConfirm(String bean, int parameter) {
            if(bean.equals(String.valueOf(parameter))){ 
                return "selected";
            }else {
                return "";
            } 
    }
    
    public String typeResultConfirm(String type) {
        if(type.equals("1")){return "エンジニア";} 
        else if(type.equals("2")){return "営業";} 
        else if(type.equals("3")){return "その他";}
        else {return "種別が正しく選択されていません。";}
    }


}
 
