/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Yoshiyasu
 */
public class Cleric {
    String name = this.name;
    int hp = 50;
    static final int maxHp = 50;
    int mp = 10;
    static final int maxMp = 10;
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    Cleric(String name, int hp) {
        this(name, hp, maxMp);
    }
    Cleric(String name) {
        this(name, Cleric.maxHp, Cleric.maxMp); // 質問：Cleric.maxMpとmaxMpの違い。使い分ける必要は！？
    }
    void selfAid() {
        System.out.println("セルフエイドを使用");
        this.mp -= 5;
        this.hp = this.maxHp;
    }
    int pray(int sec) {
        System.out.println("祈りを使用");
        Random rand =  new Random();
        int recover = sec + rand.nextInt(2);
        if (recover > 10) {
            recover = this.maxHp;
        }
        System.out.println(recover);
        return recover;
    }
}
