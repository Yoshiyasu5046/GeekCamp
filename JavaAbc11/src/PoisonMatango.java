/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshiyasu
 */
public class PoisonMatango extends Matango {
    private int poisonCount = 5;
    // constructor
    PoisonMatango(char suffix) {
        super(suffix);
    }
    // operation
    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた");
            int damage = h.getHp() / 5;
            h.setHp(h.getHp() - damage);
            System.out.println(damage + "ポイントのダメージ");
            this.poisonCount--;
        }
    }
}
