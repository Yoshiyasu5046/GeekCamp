
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("ユーザーの入札額");
//        u.setUserBit(); //このsetterを正しく使うには？
        System.out.println("ディーラーの結果");
        Dealer d = new Dealer();
        d.hit();
        System.out.println(d.open());
        System.out.println("ユーザーの結果");
        User u = new User();
        u.hit();
        System.out.println(u.open());
    }
// エラーレポート
// 1. myCardsの合計がすでに18以上であるにも関わらず、hitが時折実行されてしまう。
// 2. 時折totalが29以上になる。17+11=28なので、28より大きくなることは考えらないはずだが…
}
