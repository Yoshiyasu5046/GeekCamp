/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 練習問題4-1
        int[] points = new int[4];
        double[] weights = new double[5];
        boolean[] answers = new boolean[3];
        String[] names = new String[3];
        
        // 練習問題4-2
        int[] moneyList = {121902, 8302, 55100};
        System.out.println(moneyList[0]);
        for (int i : moneyList) {
            System.out.println(i);
        }
        
        //練習問題4-4
        int[] numbers = {3,4,9};
        System.out.println("一桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int i : numbers) {
            if (i == input) {
                System.out.println("アタリ！");
            }
        }
    }
    
}
