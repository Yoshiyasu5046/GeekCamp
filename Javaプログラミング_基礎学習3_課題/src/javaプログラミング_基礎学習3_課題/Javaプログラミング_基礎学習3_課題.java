/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaプログラミング_基礎学習3_課題;

/**
 *
 * @author Yoshiyasu
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Javaプログラミング_基礎学習3_課題 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "http://localhost:8084/JavaUserManagementSystem_ver2.0/";
        System.out.println(s.length());
        // 課題1のメソッド（introduceOneself）の実行
        // introduceOneself(); 
        
//        // 課題2のメソッド（奇数か偶数か）の実行
//        System.out.println(even_or_odd(10)); 
//        
//        // 課題3のメソッドの実行
//        squared_or_unSquared(4.0, 5.0, true); 
//        
//        // 課題5の実行
//        ArrayList output1 = profile_info(12, "Tom", 1987, 12, 30, "California"); //課題5のメソッドの実行
//        output_profile(output1);
//        
//        //　課題6の実行
//        ArrayList output2 = validId_profile(10);
//        output_profile(output2);
//        
//        // 課題7の実行
//        output_profile_with_null();
//        
//        //　課題8の実行
//        output_two_profile();  
    }
    
    // 課題1 自分のプロフィール
    public static void introduceOneself() {
        String name = "北原";
        int age = 24;
        double height = 175.8;
        char gender = '男';
        for (int i = 1; i <= 10; i++) {
            System.out.println( i  + "回目です。");
            System.out.println("私は" + name + "です。");
            System.out.println("年齢は" + age + "です。");
            System.out.println("身長は" + height + "です。");
            System.out.println("性別は" + gender + "です。");
        }
    }    
    //　課題2　奇数か偶数か
    public static String even_or_odd(int x) {
        if (x % 2 == 0) {
            return "偶数";
        } else {
            return "奇数";
        }
    }
    // 課題3　
    public static void squared_or_unSquared(double n, double m, boolean type) {
        m = 5.0;
        double result = n * m;
        if (type == true) {
           System.out.println(Math.pow(result, 2.0)) ;
        } else if (type == false) {
            System.out.println(result);
        } 
    }
    // 課題4  
    public static void introduceOneself2() {
        
    }
    // 課題5
    public static ArrayList profile_info(int id, String name, int year, int month, int day, String address) {
        String birth = year + "年" + month + "月" + day + "日";
        ArrayList profile_array = new ArrayList();
        profile_array.add(id);
        profile_array.add(name);
        profile_array.add(birth);
        profile_array.add(address);
        return profile_array;
    }
    // プロファイルを表示するメソッド
    public static void output_profile(ArrayList array) {
        if (array != null) {
            for (int i = 1; i < array.size(); i++) {
                System.out.println(array.get(i));    
            }
        } else {
            System.out.println("無効値が入力されています。");
        }
        
    }

    
    // 課題6
    public static ArrayList validId_profile(int id) {
        ArrayList profile1 = profile_info(1, "Mike", 1988, 10, 30, "California");
        ArrayList profile2 = profile_info(2, "John", 1994, 6, 30, "Shibuya");
        ArrayList profile3 = profile_info(3, "Miena", 1991, 7, 3, "Kobe");
        switch (id) {
            case 1:
                return profile1;
            case 2:
                return profile2;
            case 3:
                return profile3;
            default:
                ArrayList output_id = null;
                return output_id;
        }
    }
    
    
    // 課題7
    public static void output_profile_with_null() {
       ArrayList profile1 = profile_info(4, "Mike", 1988, 10, 30, "California");
       ArrayList profile2 = profile_info(5, "John", 1994, 6, 30, null);
       ArrayList profile3 = profile_info(6, "Miena", 1991, 7, 3, "Kobe"); 
       ArrayList[] profiles = {profile1, profile2, profile3};
       ArrayList nul_value = null;
       for (ArrayList value : profiles) {
           for (int i = 0; i < value.size();i++) {
               if (value.get(i) == null){
                   nul_value = value;
               }
           }
       }
       for (int i = 0;i < profiles.length; i++) {
           if (nul_value == profiles[i]) {
               continue;
           }
           System.out.println(profiles[i]);
       }
    }
    //　課題8
    public static void output_two_profile() {
        int limit = 2;
        ArrayList profile1 = profile_info(4, "Mike", 1988, 10, 30, "California");
        ArrayList profile2 = profile_info(5, "John", 1994, 6, 30, "Kyoto");
        ArrayList profile3 = profile_info(6, "Miena", 1991, 7, 3, "Kobe"); 
        ArrayList[] profiles = {profile1, profile2, profile3};
        for (int i = 0; i < limit; i++) {
            System.out.println(profiles[i]);
        }
    }
}



