/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.*;
import java.io.*;

/**
 *
 * @author Yoshiyasu
 */

// Java標準クラス課題基礎編

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        // 課題1の実行
        sample_timeStamp();
        
        // 課題2の実行
        sample_currentTime();
        
        // 課題3の実行
        sample_date();
        
        // 課題4の実行
//        sample_msTimeStamp();
        
        // 課題5の実行
        nameInfo();
        
        // 課題6の実行
        emailInfo();
        
        //　課題7の実行
        System.out.println(sampleReplace("きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます"));
        
        // 課題8と9の実行
        inputSelfIntro("/Users/Yoshiyasu/Desktop/selfIntro.txt");
        outputSelfIntro("/Users/Yoshiyasu/Desktop/selfIntro.txt");
    }
    
    // 課題1のメソッド
    public static void sample_timeStamp() {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 1, 1, 0, 0, 0);
        Date past = cal.getTime();
        System.out.println("課題1の実行結果");
        System.out.println(past);
    }
    
    // 課題2のメソッド
    public static void sample_currentTime() {
        Date now = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        String s = f.format(now);
        System.out.println("課題2の実行結果");
        System.out.println(s);
    }
    
    // 課題3のメソッド
    public static void sample_date() throws Exception {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = f.parse("2016/11/04 10:00:00");
        System.out.println("課題3の実行結果");
        System.out.println(d);
    }
    
    // 課題4のメソッド
//    public static void sample_msTimeStamp() {
//        Calendar cal = Calendar.getInstance();
//        cal.set(2015, 1, 1, 0, 0, 0);
//        Date point1_date = cal.getTime();
//        System.out.println(point1_date);
//        cal.set(2014, 12, 31, 23, 59, 59);
//        Date end = cal.getTime();
//        System.out.println("課題4の実行結果");
////        int result = end - start;
//        System.out.println();
//    }
    
    // 課題5のメソッド 
    public static void nameInfo() throws Exception {
        String name = "北原吉泰";
        System.out.println("課題5の実行結果");
        System.out.println(name.length());
        System.out.println(name.getBytes("UTF-8").length);
    }
    
    // 課題6のメソッド 
    public static void emailInfo() throws Exception {
        String email = "yoshi.kitahara.niapat@gmail.com";
        int index = email.indexOf("@");
        System.out.println("課題6の実行結果");
        System.out.println(email.substring(index));
    }
    
    // 課題7のメソッド
    public static String sampleReplace(String string) {
        System.out.println("課題7の実行結果");
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i) == "I"); {
                string = string.replace("I", "い");
            }
            if (string.substring(i) == "U"); {
                string = string.replace("U", "う");
            }
        }
        return string;
    }
    
    //　課題8のメソッド
    public static void inputSelfIntro(String filePath) throws IOException {
        try {
            File txt = new File(filePath);
            FileWriter fw = new FileWriter(txt);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("はじめまして、北原吉泰と申します。");
            bw.close();
            fw.close();
        } catch(IOException e) {
            System.out.println("ファイルエラーが発生");
        }
    }
    // 課題9のメソッド
    public static void outputSelfIntro(String filePath) throws IOException {
        try {
            System.out.println("課題8,9の実行結果");
            File txt = new File(filePath);
            FileReader fr = new FileReader(txt);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
            fr.close();   
        }catch (IOException e) {
            System.out.println("ファイルエラーが発生");
        }
    }
}
