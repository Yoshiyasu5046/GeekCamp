/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Yoshiyasu
 */
public class time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        Date now = new Date();
//        System.out.println(now);
        //　現在の年を表示する
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.println(y);
        // 指定した日のDate型の値を得る
        c.set(2011, 8, 7, 10, 45, 40);
        c.set(Calendar.YEAR, 2012);
        Date past = c.getTime();
        System.out.println(past);
        // 本日の日時を表示
        Date current = new Date();
        SimpleDateFormat f = new SimpleDateFormat();
        String s = f.format(current);
        System.out.println(s);
    }
}
