/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class Matango {
    int hp = 50;
    private char suffix;
    public Matango(char suffix) {
        this.suffix = suffix;
    }
    public void attack(Hero h) {
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.setHp(h.getHp() - 10);
    }
}
