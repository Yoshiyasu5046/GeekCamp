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

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 練習14-1
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        Date future = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
}