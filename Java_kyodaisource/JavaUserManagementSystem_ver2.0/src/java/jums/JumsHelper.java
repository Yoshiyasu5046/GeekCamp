package jums;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


/**
 * 画面系の処理や表示を簡略化するためのヘルパークラスです。定数なども保存されます
 * @author hayashi-s
 */
public class JumsHelper {
    // セッションを呼び出す。 
  
    
    public static JumsHelper getInstance(){
        return new JumsHelper();
    }
    
    //トップへのリンクを定数として設定
    private final String homeURL = "index.jsp";
    
    //トップへのリンクを返却
    public String home(){
        return "<a href=\""+homeURL+"\">トップへ戻る</a>";
    }
    
        
 // 乱数比較をメソッドにまとめたい。だが今のところ使えない…後ほど、Javaクラスに書き写す。
    public void AccessChecker(HttpServletRequest request, HttpSession session, boolean shingi) {
        // オーバライドする必要あり。ただオーバーライドすると余計複雑になる可能性が高い。 
        String accesschk = request.getParameter("ac");
        if(accesschk == null || (Integer)session.getAttribute("ac") != Integer.parseInt(accesschk)){
            shingi = false;
        }
    }
    
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
    
    public String dayCheck(int year, int month, int day) {
        String unexistingDay = null;
        if (month == 2) {
            // 閏年の2月の日にち選択の処理。
            if (LeapYear(year)) {
                // 閏年のため、30日と31日を選択できなくするための処理
                if (day > 29) {
                    unexistingDay = "入力された日にちが正しくありません。この年は閏年のため、30日と31日は選択できません。";
                    return unexistingDay;
                } else {
                    return unexistingDay;
                }
            // 閏年でない2月の日にち選択の処理。
            } else {
                // 29,30,31日を選択できなくするための処理。 
                if (day > 28) {
                    unexistingDay = "入力された日にちが正しくありません。この年は閏年でないため、29日、30日、31日は選択できません。";
                    return unexistingDay;
                }else {
                    return unexistingDay;
                }
            }
        // 2月以外の月の処理
        } else {
                // 4,6,9,11月は31日がないため、31日を選択できないようにする処理。
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        unexistingDay = "入力された日にちが正しくありません。この月は31日を選択できません。";
                        return unexistingDay;
                    } else {
                        return unexistingDay;
                    }
                } else { 
            // 1,3,5,7,8,12月は31日が存在するため、日にち選択の制限を一切設けていない。    
                        return unexistingDay;
                }
        }
    }
    
    
    public String typeConfirm(int i) {
        switch(i){
            case 1:
                return "営業";
            case 2:
                return "エンジニア";
            case 3:
                return "その他";
        }
        return "";
    }
    
    public String chkinput(ArrayList<String> chkList){
        String output = "";
        for(String val : chkList){
                if(val.equals("name")){
                    output += "名前";
                }
                if(val.equals("year")){
                    output += "年";
                }
                if(val.equals("month")){
                    output +="月";
                }
                if(val.equals("day")){
                    output +="日";
                }
                if(val.equals("type")){
                    output +="種別";
                }
                if(val.equals("tell")){
                    output +="電話番号";
                }
                if(val.equals("comment")){
                    output +="自己紹介";
                }
                output +="が未記入です<br>";
            }
        return output;
    }
    
    
    public String finalInputCheck(UserDataBeans udb, String outputDayCheck, String checkInput) {
        String unexistingDay = null;
        if(udb.chkproperties().size() != 0 && outputDayCheck != null) {
                unexistingDay = checkInput + "<br>" + outputDayCheck;
                return unexistingDay;
        } else if(outputDayCheck != null) {
                unexistingDay = outputDayCheck + "<br>";
                return unexistingDay;
        } else if(udb.chkproperties().size() != 0) {
                unexistingDay = checkInput + "<br>";
                return unexistingDay;
        } else { 
                return unexistingDay;
        }
    }   

    void referer(HttpServletRequest request, HttpSession session, int lengthOfString, String pathName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
 
